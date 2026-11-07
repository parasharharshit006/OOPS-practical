//practical 3.2
class Machine {
    String brand;

    public Machine(String brand) {
        this.brand = brand;
    }

    public void powerOn() {
        System.out.println(brand + " machine is now powered ON.");
    }
}

interface NetworkConnectable {
    void connectWiFi();
}


class Computer extends Machine {
    int ramSize;

    public Computer(String brand, int ramSize) {
        super(brand);
        this.ramSize = ramSize;
    }

    public void bootOS() {
        System.out.println(brand + " computer is booting up with " + ramSize + "GB RAM.");
    }
}
class SmartLaptop extends Computer implements NetworkConnectable {
    
    public SmartLaptop(String brand, int ramSize) {
        super(brand, ramSize);
    }

    @Override
    public void connectWiFi() {
        System.out.println(brand + " SmartLaptop connected to secure Wi-Fi.");
    }

    void portableFeature() {
        System.out.println(brand + " SmartLaptop is lightweight and battery-operated.");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        SmartLaptop myLaptop = new SmartLaptop("Dell", 16);

        System.out.println("--- Demonstrating Hybrid Inheritance Behaviors ---");
        myLaptop.powerOn();        
        myLaptop.bootOS();         
        myLaptop.connectWiFi();     
        myLaptop.portableFeature();
    }
}