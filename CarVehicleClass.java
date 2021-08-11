
class Vehicle1{
	int x;
	Vehicle1(){
		this(10); // line n1
	}
	Vehicle1(int x){
		this.x = x;
	}
}
class Car1 extends Vehicle1{
	int y;
	Car1(){
		super(10);
	}
	Car1(int y){
		super(y);
		this.y = y;
	}
	public String toString() {
		return super.x +":"+this.y;
	}
}
public class CarVehicleClass {

	public static void main(String[] args) {
		
		Vehicle1 y = new Car1(20);
		System.out.println(y);
	}

}
