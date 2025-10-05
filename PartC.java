import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return name + " (₹" + String.format("%,.0f", price) + ")";
    }
}

public class PartC{
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 80000, "Electronics"),
            new Product(2, "Smartphone", 10000, "Electronics"),
            new Product(3, "Headphones", 5000, "Electronics"),
            new Product(4, "Mouse", 2000, "Electronics"),
            new Product(5, "Keyboard", 3000, "Electronics"),
            new Product(6, "Office Chair", 12000, "Furniture"),
            new Product(7, "Desk", 7000, "Furniture"),
            new Product(8, "Bookshelf", 2600, "Furniture")
        );

        Map<String, Optional<Product>> mostExpensiveByCategory =
            products.stream()
                    .collect(groupingBy(
                        Product::getCategory,
                        maxBy(Comparator.comparingDouble(Product::getPrice))
                    ));

        double averagePrice = products.stream()
                                      .collect(averagingDouble(Product::getPrice));

        mostExpensiveByCategory.forEach((category, productOpt) -> {
            if (!category.equals("Appliances")) {
                productOpt.ifPresent(product ->
                    System.out.println(category + " → Most Expensive: " + product)
                );
            }
        });

        System.out.println("Average Price of All Products: ₹" + String.format("%,.0f", averagePrice));
    }
}
