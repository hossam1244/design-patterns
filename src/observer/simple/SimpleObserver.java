package observer.simple;
	
public class SimpleObserver implements Observer {
	private int value;
	private Observable simpleObservable;
	
	public SimpleObserver(Observable simpleObservable) {
		this.simpleObservable = simpleObservable;
		simpleObservable.registerObserver(this);
	}
	
	public void update(int value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.println("Value: " + value);
	}
}
