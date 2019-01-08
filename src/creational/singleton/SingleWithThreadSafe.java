package creational.singleton;

public class SingleWithThreadSafe {

	// create an object of SingleObject
	private static volatile SingleWithThreadSafe instance = null;

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleWithThreadSafe() {
	}

	// Get the only object available
	public static SingleWithThreadSafe getInstance() {
		if (instance == null) {
			instance = new SingleWithThreadSafe();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
