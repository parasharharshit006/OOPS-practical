//practical 9
class Employee {
    String name;
    double salary;
    static int employeeCount = 0;
    public Employee() {
        this("Not Assigned", 0.0);
    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }
    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : $" + salary);
        System.out.println("-----------------------------------");
    }
    public static void displayEmployeeCount() {
        System.out.println("Total Employees Created: " + employeeCount);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        System.out.println("=== Initial State ===");
        Employee.displayEmployeeCount();
        System.out.println();
        System.out.println("=== Creating Employees ===");
        Employee emp1 = new Employee();
        System.out.print("Object 1 created -> ");
        emp1.displayDetails();
        Employee emp2 = new Employee("Alice Smith", 65000.0);
        System.out.print("Object 2 created -> ");
        emp2.displayDetails();
        Employee emp3 = new Employee("Bob Jones", 72000.50);
        System.out.print("Object 3 created -> ");
        emp3.displayDetails();
        System.out.println("=== Final Count ===");
        Employee.displayEmployeeCount();
    }
}