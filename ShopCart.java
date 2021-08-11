class Cart{
	ProductClass p;
	double totalAmount;
}
class ProductClass{
	String name;
	Double price;
}
public class ShopCart {

	public static void main(String[] args) {
		Cart c = new Cart();
		System.out.println(c.p + ":" +c.totalAmount);

	}

}
