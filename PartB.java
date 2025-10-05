import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int id;
    double marks;

    Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
}

public class PartB{
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Ravi", 1, 82),
            new Student("Aditi", 2, 91),
            new Student("Kiran", 3, 78),
            new Student("Meena", 4, 65)
        );

        System.out.println("Students scoring above 75%:");

        students.stream()
                .filter(s -> s.marks > 75)
                .sorted((s1, s2) -> Double.compare(s1.marks, s2.marks))
                .map(s -> s.name)
                .forEach(System.out::println);
    }
}
