class E1 extends Exception{}
class E2 extends RuntimeException{}

public class ExceptionClass {

	public void m1() {
		System.out.println("m1.accessed");
	//	throw new E1();
	}
	public void m2() {
		System.out.println("m1.accessed");
		throw new E2();
	}
	public static void main(String[] args) {
		int level = 1;
		ExceptionClass obj = new ExceptionClass();
		if(level <=5 && level >=3) {
			obj.m1();
		}else {
			obj.m2();
		}

	}

}
