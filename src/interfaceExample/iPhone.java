package interfaceExample;

public class iPhone extends Phone {

	@Override
	public String faceID() {

		return "my face";
	}

	@Override
	public void location() {
		System.out.println("iPhone location");
	}

	@Override
	public void capacity() {
		System.out.println("iPhone capacity");
	}

	@Override
	void hi() {
		System.out.println("hi from iPhone");
	}

	@Override
	public void lock() {
		System.out.println("iPhone is locked");
	}

	@Override
	public void call(long number) {
		System.out.println("iPhone is calling " + number + " times");
	}

	@Override
	public void text() {
		System.out.println("iPhone is texting");
	}

	@Override
	public void takePicture() {
		System.out.println("iPhone is taking picture");
	}

}
