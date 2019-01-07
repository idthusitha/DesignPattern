package creational.singleton;

public class SingleObject {

	// create an object of SingleObject
	private static volatile SingleObject instance = null;

	// make the constructor private so that this class cannot be
	// instantiated
	private SingleObject() {
	}

	// Get the only object available
	public static SingleObject getInstance() {
		if (instance == null) {
			//double check
			synchronized (SingleObject.class) {
				instance = new SingleObject();
			}
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
