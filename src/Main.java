import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1: Create and store the dataset in a collection - List of employees
        List<Employee> employees = getEmployees();

        // 2: Define a Function that takes an Employee and returns a concatenated string
        Function<Employee, String> nameDepartmentConcatenator = employee -> employee.getName() + " - " + employee.getDepartment();

        // 3: Use streams to generate a new collection of concatenated strings and sorted by department
        List<String> employeeInfo = employees.stream()
                .map(nameDepartmentConcatenator)
                .sorted(Comparator.comparing(s -> s.split(" - ")[1]))
                .collect(Collectors.toList());

        // Print the concatenated strings
        System.out.println("Employee Name and Department List:");
        employeeInfo.forEach(System.out::println);

        // 4. Calculate the average salary of all employees
        double averageSalary = employees.stream().mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.printf("\nAverage Salary: $%.2f\n", averageSalary);

        // 5: Generalize the program by filtering employees whose age is above a threshold (e.g., 30 years)
        int ageThreshold = 30;
        List<Employee> filteredEmployees = employees.stream()
                .filter(employee -> employee.getAge() > ageThreshold)
                .collect(Collectors.toList());

        // Print the filtered list
        System.out.println("\nEmployees above age " + ageThreshold + ":");
        filteredEmployees.forEach(employee -> System.out.println(employee.getName() + " - " + employee.getAge()));
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