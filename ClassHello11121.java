
public class ClassHello11121 {
	int a1;
	public static void main(String[] args) {
		ClassHello11121 item = new ClassHello11121();
		item.a1=11;
		String sb="hello";
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		System.out.println(i + "" + sb + "" + item.a1);
	}
	private static void doString(String s) {
		
		s.concat(" "+s);
	}
	private static void doProduct(int a) {
		a=a*a;
		
	}

}
