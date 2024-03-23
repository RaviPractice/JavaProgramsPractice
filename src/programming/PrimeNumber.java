package programming;

public class PrimeNumber {
	// prime nos -> starting from 2,3,5,7,11,13..etc
	
	//check boundary conditions
	public static boolean isPrimeNo(int num) {
		if(num <=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
	return true;	
	}
	// 10 -->2,3,5,7
	public static void getPrimeNos(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrimeNo(i)) {
				System.out.println(i + " ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 is a prime no:" +isPrimeNo(1));
		System.out.println("2 is a prime no:" +isPrimeNo(2));
		System.out.println("3 is a prime no:" +isPrimeNo(3));
		System.out.println("4 is a prime no:" +isPrimeNo(4));
		System.out.println("5 is a prime no:" +isPrimeNo(5));
		
		//System.out.println("prime no upto 10" +getPrimeNos(10));
		
		getPrimeNos(10);
		getPrimeNos(20);

	}

}
