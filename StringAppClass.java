
public class StringAppClass {
	
	String myStr = "9009";
	public void doStuff(String str) {
		int myNum = 0;
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
			
		}catch (NumberFormatException ne) {
			System.err.println("Error");
		}
		System.out.println("myStr"+ myStr +"MyNum" + myNum);
	}
	public static void main(String[] args) {
		StringAppClass obj = new StringAppClass();
		obj.doStuff("7007");

	}

}
