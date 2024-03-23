package programming;

public class countCharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// specific character how many times occurance of the given string
		// use length and repolace method
		String str = "Java Language";
		// how many times a is repeating
		int totallength = str.length();
		int reovealength = str.replace("a","").length();
		int count = totallength-reovealength;
		System.out.println("number of occurance of the given string is :" +count);

	}    

}
