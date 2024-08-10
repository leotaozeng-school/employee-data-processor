import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1: Create and store the dataset in a collection
        List<Employee> employees = getEmployees();
    }

    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee("Alice", 29, "Engineering", 75000),
                new Employee("Bob", 45, "Marketing", 80000),
                new Employee("Charlie", 34, "Sales", 60000),
                new Employee("Diana", 27, "Engineering", 72000),
                new Employee("Evelyn", 31, "HR", 65000),
                new Employee("Frank", 50, "Finance", 90000),
                new Employee("Grace", 41, "Sales", 68000),
                new Employee("Henry", 36, "Marketing", 77000),
                new Employee("Isabella", 38, "HR", 82000),
                new Employee("Jack", 32, "Engineering", 83000),
                new Employee("Chris", 30, "Engineering", 76000)
        );
    }
}