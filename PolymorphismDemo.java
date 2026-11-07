//practical 4
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    public double calculatePay() {
        return 0.0; 
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculatePay() {
        return monthlySalary; 
    }
}
class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked; 
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Compile-Time Polymorphism (Method Overloading) ===");
        Calculator calc = new Calculator();
        System.out.println("add(5, 10) [2 ints] = " + calc.add(5, 10));
        System.out.println("add(2, 4, 6) [3 ints] = " + calc.add(2, 4, 6));
        System.out.println("add(5.5, 4.2) [2 doubles] = " + calc.add(5.5, 4.2));
        System.out.println("\n=== 2. Runtime Polymorphism (Method Overriding) ===");
        Employee emp1 = new FullTimeEmployee("Alice", 5000.0);
        Employee emp2 = new HourlyEmployee("Bob", 25.0, 160);
        System.out.println(emp1.name + "'s Pay: $" + emp1.calculatePay());
        System.out.println(emp2.name + "'s Pay: $" + emp2.calculatePay());
    }
}