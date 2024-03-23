package programming;

public class ArmstrongNumber {
	
	public static void armstrNo(int num) {
		int cube =0;
		int t,r;
		t=num;
		while(num >0){
			r = num % 10;
			num = num / 10;
			cube = cube + (r*r*r);
		}
		if (t==cube) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not armstrong number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrNo(153);
		armstrNo(370);
		armstrNo(455);
		armstrNo(0);
		
		

	}

}
