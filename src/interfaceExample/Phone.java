package interfaceExample;

import java.util.List;

public abstract class Phone implements FaceRecognition, Memory{

	abstract void hi();
	
	List contactList;
	public String name;
	public String model;
	public int memory;
	
	public abstract void lock();
	public abstract void call(long number);
	public abstract void text();
	public abstract void takePicture();
	
	
	
}
