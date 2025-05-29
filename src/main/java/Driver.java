import src.main.java.Counter;

public class Driver {

    public static void main(String[] args) {

        Counter counter = new Counter();

        System.out.println("Current count: " + counter.getCount());

        counter.increaseBy(1);
        System.out.println("Current count: " + counter.getCount());

        counter.decreaseBy(1);
        System.out.println("Current count: " + counter.getCount());

        counter.multiplyBy(3);
        System.out.println("Current count: " + counter.getCount());
    }
}
