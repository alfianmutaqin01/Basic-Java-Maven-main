package src.main.java;

public class Counter {

    private int count;

    public Counter() {
        this.reset();
    }

    public void reset() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void increaseBy(int value) {
        count += value;
    }

    public void decreaseBy(int value) {
        count -= value;
    }

    public void multiplyBy(int value) {
        count *= value;
    }

    public int getCount() {
        return count;
    }
}
