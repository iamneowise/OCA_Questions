
class AB{
	static int hitCount;
	static void printHitCount() {
		System.out.println("A Class"+hitCount);
	}
}
class ABC extends AB{
	static void printHitCount() {
		System.out.println("B Class"+hitCount);
	}
}
public class HitCount {

	public static void main(String[] args) {
		
		AB.hitCount=100;
		ABC.hitCount=200;
		AB.printHitCount();
		ABC.printHitCount();
	}

}