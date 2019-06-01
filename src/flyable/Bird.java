package flyable;

public class Bird implements Flyable, Sound{

	@Override
	public void fly() {
		System.out.println("Fly like bird");
	}

	@Override
	public void sounds() {
		System.out.println("Chik Chik");
	}
	
	
	
	

}
