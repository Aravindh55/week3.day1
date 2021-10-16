package week3.day1;

public class IgnoreCase {

	public static void main(String[] args) {
		String text1="I am Learning Java";
	    String text2="I am learning java";  
	    if (text1==text2) {
	    	System.out.println("both are equal");
			
		}
	    if (text1.equals(text2)) {
	    	System.out.println("both are equal");
			
		}
	    if (text1.equalsIgnoreCase(text2)) {
	    	System.out.println("both are equal");
			
		}
	    else {
			System.out.println("not equal");
		}

	}

}
