class LogFileException extends Exception{}
class AccessViolationException extends RuntimeException{}

public class LogFileApp {

	public static void main(String[] args) throws LogFileException{
		LogFileApp obj = new LogFileApp();
		try {
			obj.open();
			obj.process();
		}
		catch(Exception e) {
			System.out.println("completed");
		}

	}

	public void process() throws LogFileException  {
		System.out.println("Processed");
		throw new LogFileException();
	}

	public void open() {
	System.out.println("Opened");
	throw new AccessViolationException();
		
	}

}
