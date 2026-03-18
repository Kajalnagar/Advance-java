import java.util.*;
import java.util.stream.*;

// write a java program to filter emplouees whose salary is less then 60000 and print the name in uppercase
class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) { // fixed order
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class stream3 {
    public static void main(String[] args){

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"Amrit", 50000));
        list.add(new Employee(2,"Riya", 70000));
        list.add(new Employee(3,"Kajal", 90000));
        list.add(new Employee(4,"who", 40000));

        List<String> result = list.stream()
                .filter(e -> e.salary < 60000)        // fixed condition
                .map(e -> e.name.toUpperCase())      // convert name to uppercase
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
