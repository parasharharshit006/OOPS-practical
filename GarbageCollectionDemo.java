//practical 7
class Demo {
    private String name;
    public Demo(String name) {
        this.name = name;
        System.out.println("Object created: " + name);
    }
    public void useObject() {
        System.out.println("Using object: " + name);
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector has cleaned up object: " + name);
    }
}
public class GarbageCollectionDemo {
    public static void main(String[] args) {
        Demo obj = new Demo("TestObject");
        obj.useObject();
        obj = null;
        System.out.println("Reference removed. Object is now eligible for GC.");
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
    }
}