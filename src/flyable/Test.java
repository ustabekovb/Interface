package flyable;

public class Test extends Object{
	
	public static void main(String[] args) {
		
		Bird b1 = new Bird();
		b1.fly();
		b1.sounds();
		System.out.println("Wing count: "+b1.WINGCOUNT);
		System.out.println("Tail count: "+b1.TAILCOUNT);
	}
	
	@Override
	public String toString() {
		return "Bird Class";
	}
	

}
