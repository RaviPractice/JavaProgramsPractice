package programming;

public class ReverseStringPrograme {

	public static void main(String[] args) {
		
		getReverseString("Hello World");
		/*
		 * String s = "Selenium Java"; int len = s.length();
		 * System.out.println("length of the string is : "+len); String rev =""; for(int
		 * i=len-1;i>=0;i--) { rev = rev + s.charAt(i);
		 * 
		 * }
		 */
 //System.out.println(" before reverse reverse of the string is :"+rev);
		
		// using strringbuffer
		String s2 = "Samsung";
		StringBuffer sb= new StringBuffer(s2).reverse();
		System.out.println("reverse of the string is :"+sb);
	}  
	
	public static void getReverseString(String Value) {
		String s1 = "Hello World";
		System.out.println("before reverse of the string is :" +s1);
		String rev ="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev = rev+s1.charAt(i);
		}
		System.out.println("Reverse of the string is :"+rev);
		
		  
	}

}
