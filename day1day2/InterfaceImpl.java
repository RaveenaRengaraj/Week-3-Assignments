package week3.day1day2;

public class InterfaceImpl implements InterfaceClass {

	@Override
	public void connect() {
		System.out.println("Connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("executed");
	}
}

