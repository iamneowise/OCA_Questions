
public class ArrayElementPrint {

	public static void main(String[] args) {
		int[] intArr= {8,16,32,64,128};
		
		// option 1
		for(int i: intArr) {
			System.out.println(i);
		}
		
		//option 2
//		for(int i: intArr) {
//			System.out.println(intArr[i]);
//		}
//	
		
		//option 3
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
	}

	

}
