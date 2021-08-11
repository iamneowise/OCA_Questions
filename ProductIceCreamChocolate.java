import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	Product(int id, String name){
		this.id = id;
		this.name=name;
	}
}

public class ProductIceCreamChocolate {

	public static void main(String[] args) {
		List<Product> lst=new ArrayList<>();
		lst.add(new Product(10,"IceCream"));
		lst.add(new Product(11,"Chocolate"));
		Product p1=new Product(10,"IceCream");
		System.out.println(lst.indexOf(p1));
	}

}
