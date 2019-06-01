package interfaceExample;

public class Test {

	public static void main(String[] args) {
		
		iPhone ip = new iPhone();
		ip.call(307264999);
		System.out.println(ip.faceID());
		ip.hi();
		ip.location();
		System.out.println("--------------------");
		Samsung sm = new Samsung();
		sm.capacity();
		sm.lock();
		sm.takePicture();
		System.out.println("--------------------");
		Memory mem = new iPhone();
		mem.faceID();
	    int memory = ((Phone)mem).memory;
	    
	    Phone p1 = new iPhone();
	    
	    
	}
}
