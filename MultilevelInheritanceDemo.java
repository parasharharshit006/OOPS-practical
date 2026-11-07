//practical 2.2 multilevel inheritance
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Employee extends Person {
    int empId;
    double salary;

    public Employee(String name, int age, int empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("Employee ID: " + empId + ", Salary: $" + salary);
    }
}
class Manager extends Employee {
    String department;

    public Manager(String name, int age, int empId, double salary, String department) {
        super(name, age, empId, salary);
        this.department = department;
    }
    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting for the " + department + " department.");
    }
}
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
       
        Manager mgr = new Manager("Alice", 35, 101, 85000.0, "Engineering");
        mgr.displayEmployeeInfo(); 
        mgr.department = "IT Security"; 
        mgr.conductMeeting();      
    }
}
    

