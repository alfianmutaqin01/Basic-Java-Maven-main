import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increaseBy();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decreaseBy();
		
		System.out.println("Current count:" + counter.getCount());
		counter.multiplyBy(3);
		
	}

}
