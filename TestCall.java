class Caller{
	private void init() {
		System.out.println("Initialized");
	}
	protected void start() {
		init();
		System.out.println("Started");
	}
}

public class TestCall {

	public static void main(String[] args) {
		Caller c=new Caller();
		c.start(); // line n1
		c.init();

	}

}
