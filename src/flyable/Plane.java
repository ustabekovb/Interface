package flyable;

public class Plane implements Flyable, Sound{

	@Override
	public void fly() {
		System.out.println("Fly like plane");
	}

	@Override
	public void sounds() {
		System.out.println("Noisy");
	}
	
	

}
