interface I{
	public void displayI();
}
abstract class C2 implements I{
	public void displayc2() {
		System.out.println("C2");
	}
}
class C1 extends C2 {
	public void displayI() {
		System.out.println("C1");
	}
}
public class IC1C2 {

	public static void main(String[] args) {
		C2 obj1 = new C1();
		I obj2 = new C1();
		C2 s = (C2) obj2;
		I t=obj1;
		t.displayI();
		s.displayc2();
	}

}
