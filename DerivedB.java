
class Base{
	public void test(){
		System.out.println("Base");
	}
}
class DerivedA extends Base{
	public void test(){
		System.out.println("Derived A");
	}
}
public class DerivedB extends DerivedA {
	public void test(){
		System.out.println("Derived B");
	}
	public static void main(String[] args) {
		
Base b1=new DerivedB();
Base b2=new DerivedA();
Base b3=new DerivedB();
Base b4 = b3;
b1 = (Base) b2;
b1.test();
b4.test();
	}

}
