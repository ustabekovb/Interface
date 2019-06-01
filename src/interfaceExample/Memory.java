package interfaceExample;

public interface Memory extends FaceRecognition{
	
	int MEMORY=128;
	int SIZE=8;
	
	void location();
	public abstract void capacity();
	
	public static void staticMethod() {
		System.out.println("Interface static method");
	}
	
	default void defaulMethod() {
		System.out.println("Interface default method");
	}
	
	
	

}
