package interfaceExample;

public class Samsung extends Phone {

	@Override
	public String faceID() {
		return "my face";
	}

	@Override
	public void location() {
		System.out.println("samsung location");
	}

	@Override
	public void capacity() {
		System.out.println("samsung capacity");
	}

	@Override
	void hi() {
		System.out.println("hi from samsung");
	}

	@Override
	public void lock() {
		System.out.println("samsung is locked");
	}

	@Override
	public void call(long number) {
		System.out.println("samsung is calling " + number + " times");
	}

	@Override
	public void text() {
		System.out.println("samsung is texting");
	}

	@Override
	public void takePicture() {
		System.out.println("samsung is taking picture");
	}

}
