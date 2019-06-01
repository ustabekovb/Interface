package flyable;

public interface Flyable extends Sound{
	
	public static final int WINGCOUNT=2;  //int WINGCOUNT=2
	int TAILCOUNT=1; //by default public static final int TAILCOUNT
	
	void fly();  //by default     public abstract fly();
	
	//abstract void fly();  //by default      default abstract fly();
	
	//default void sleep() {	
	                               //just regular default method (not abstract)
    //}

	//does not allow private and protected methods
	
	
	
}
