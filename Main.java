//practical 1(class and objects)....
class Student {
    int rollNumber;
    String name;
    double mark1;
    double mark2;
    double mark3;

    public Student(int rollNumber, String name, double mark1, double mark2, double mark3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    public double calculateTotal() {
        return mark1 + mark2 + mark3;
    }
    public double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.printf("Percentage: %.2f%%\n", calculatePercentage());
        System.out.println("-----------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice Smith", 85.5, 90.0, 78.5);
        Student student2 = new Student(102, "Bob Jones", 92.0, 88.0, 95.5);
        Student student3 = new Student(103, "Charlie Brown", 70.0, 65.5, 80.0);
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}