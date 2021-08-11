
public class Question1 {

	void readCard (int cardNo) throws Exception { System.out.println("Reading Card");

	}

	void checkCard (int cardNo) throws RuntimeException { System.out.println("Checking Card");

	}

	public static void main(String[] args) throws Exception {

		Question1 ex = new Question1();

	int cardNo = 12344;

	ex.readCard (cardNo);// line n2

	ex.checkCard (cardNo);	// line n3

	



	}

}
