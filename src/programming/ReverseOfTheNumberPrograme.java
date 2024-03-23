package programming;

public class ReverseOfTheNumberPrograme {
	public static void getReverseNumber(int number) {
		int rev=0;
		while(number!=0) {
			rev = rev*10 + number%10;
			number = number/10;
		}
		System.out.println("Reverse of the number is:"+rev);
		
	}

	public static void main(String[] args) {
		getReverseNumber(1234);
		/*
		 * long num = 1234567; int rev=0; while(num!=0) { rev = rev*10 +num%10; num =
		 * num/10; } System.out.println("reverse of the number is :"+rev);
		 */
		// by using sb
			long num = 123456;
			StringBuffer sb = new StringBuffer(String.valueOf(num)).reverse();
			System.out.println("reverseof the number using sb is :"+sb);  
			
	}  

}
