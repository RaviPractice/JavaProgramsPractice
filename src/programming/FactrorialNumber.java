package programming;

public class FactrorialNumber {

	public static int fact(int num) {
		int fact = 1;
		if(num == 0)
			return 1;
		for(int i=1;i<=num;i++) {
			fact = fact* i;
		}
		return fact;
	}
	// using recursive function
	
	public static int factorial(int num) {
		if (num == 0)
			return 1;
		else {
		return (num * factorial(num -1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("factorial of 5 is:" + fact(5));
		System.out.println("factorial of 6 is:" + fact(6));
		System.out.println("factorial of 0 is:" + fact(0));
		System.out.println("factorial of 1 is:" + fact(1));
		// using recursion calling
		System.out.println("factorial of 5 is :" + factorial(5));
		System.out.println("factorial of 6 is:" + factorial(6));
		System.out.println("factorial of 0 is:" + factorial(0));
		System.out.println("factorial of 1 is:" + factorial(1));
		
		

	}

}
