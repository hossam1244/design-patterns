package observer.simple;

public class Example {

	public static void main(String[] args) {
		SimpleObservable simpleObservable = new SimpleObservable();
	
		SimpleObserver simpleObserver = new SimpleObserver(simpleObservable);

		simpleObservable.setValue(80);

		simpleObservable.removeObserver(simpleObserver);
	}
}
