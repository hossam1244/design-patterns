package observer.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleObservable implements Observable {
	private List<observer.simple.Observer> observers;
	private int value = 0;
	
	public SimpleObservable() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(observer.simple.Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(observer.simple.Observer o) {
		observers.remove(o);
	}


	public void notifyObservers() {
		for (observer.simple.Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}