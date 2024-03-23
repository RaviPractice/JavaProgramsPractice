package programming;

public class MissingArrayElementInSequence {

	public static void main(String[] args) {
		int a[] = {0,1,2,3,4,5,6,8,9,10};
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println("sum is :"+sum);
		
		int sum1=0;
		for(int j=1;j<=10;j++) {
			sum1 = sum1+j;
		}
		System.out.println("sum total is :" +sum1);
		
		System.out.println("missing element is :" +(sum1-sum));

	}
  
}
