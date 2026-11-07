//practical 2.1 - Single Inheritance
class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting. Speed: " + speed + " km/h");
    }
}
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); 
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println(brand + " car is honking: Beep! Beep!");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120, 4);
        myCar.start();    
        myCar.honk();     
        System.out.println("Doors: " + myCar.numberOfDoors);
    }
}