package programming;

public class PalendromNumber {
	
	public static void pal(int num) {
		int r;
		int sum=0;
		int t;
		t=num;
		while(num >0) {
			r = num % 10 ;
			sum =(sum *10)+ r;
			num = num /10 ;
			
		}
		if(t == sum ) {
			System.out.println("Palendrom number");
		}
		else {
			System.out.println("Not Palendrom number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();
		pal(153);
		pal(151);//reverse of the number  
		

	}

}
