//practical 3.1 
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}
class AllInOnePrinter implements Printable, Scannable {
    
    @Override
    public void print() {
        System.out.println("AllInOnePrinter: Printing documents in high quality...");
    }

    @Override
    public void scan() {
        System.out.println("AllInOnePrinter: Scanning document to digital PDF...");
    }
}

public class PrinterTest {
    public static void main(String[] args) {
        AllInOnePrinter myPrinter = new AllInOnePrinter();
        
        System.out.println("--- All-In-One Printer Behaviors ---");
        myPrinter.print();
        myPrinter.scan();
    }
}