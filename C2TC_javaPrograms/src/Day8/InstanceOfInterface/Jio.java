package Day8.InstanceOfInterface;

public class Jio implements Phone{
	
	@Override
	public void call() {
		System.out.println("Calling using jio");
	}
	
	@Override
	public void sms() {
		System.out.println("Messaging using jio");

	}
}
