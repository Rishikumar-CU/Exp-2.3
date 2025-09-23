Overview of Experiment 2.3 (All parts a,b,c)
The repository showcases Java’s functional programming capabilities through the use of lambda expressions and stream operations. It contains three programs that demonstrate concise and efficient approaches to sorting, filtering, grouping, and aggregating data. These examples highlight how Java’s modern APIs can simplify code, improve readability, and enable powerful data processing patterns suitable for real-world applications.


Part A – Sorting Employee Objects Using Lambda Expressions

Create Employee class with name, age, and salary.

Store multiple employees in List<Employee>.

Use Collections.sort() or List.sort() with lambda expressions to:

Sort by name (alphabetically).

Sort by age (ascending).

Sort by salary (ascending or descending).

Demonstrates simplified comparator logic using lambdas.


Part B – Filtering and Sorting Students Using Streams

Create Student class with name and marks.

Store students in List<Student>.

Use stream().filter() to select students with marks > 75%.

Sort filtered list by marks using stream().sorted().

Extract names using map() and display with forEach() or collect().

Demonstrates functional-style filtering, sorting, and mapping.


Part C – Stream Operations on Product Dataset

Create Product class with name, price, and category.

Store products in List<Product>.

Group products by category using Collectors.groupingBy().

Find most expensive product in each category using Collectors.maxBy().

Calculate average price of all products using Collectors.averagingDouble().

Demonstrates efficient grouping, aggregation, and transformation with streams.
