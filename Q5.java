
public class Q5 {

	public static void main(String[] args) {
		int ans ;
		try {
			int num = 10;
			int div = 0;
			ans = num/div;
		}catch(ArithmeticException a0) {
			ans=0; // line n1
		}catch(Exception e) {
			System.out.println("invalid calculation");
		}
	//	System.out.println(ans); //line n2
	}
}
//   	public static void main(String[] args) {
//	    String s1="Moon";
//	    OraString s2=new OraString("Moon");
//	    if((s1=="Moon") && (s2.equals("Moon"))){
//	        System.out.println("A");
//	    }
//	    else{
//	        System.out.println("B");
//	    }
//	    if(s1.equalsIgnoreCase(s2.s)){
//	        System.out.println("C");
//	    }
//	    else{
//	        System.out.println("D");
//	    }
//	}
//}
//
//
//class OraString{
//    String s;
//    public boolean equals(OraString str){
//        return this.s.equalsIgnoreCase(str.toString());
//    }
//    OraString(String s){
//        this.s=s;
//    }
//}
