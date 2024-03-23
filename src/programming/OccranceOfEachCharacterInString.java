package programming;

public class OccranceOfEachCharacterInString {

	public static void main(String[] args) {
		getOccuranceOfCharCount("Hello java mava rava kava ");
		// TODO Auto-generated method stub
		/*
		 * String s="Hello java python programe"; int len = s.length(); int
		 * afterremovealen = s.replace("o","").length(); int occuranceofA = (len -
		 * afterremovealen); System.out.println(occuranceofA);
		 */

	}
	public static void getOccuranceOfCharCount(String val) {
		String s= val;
		System.out.println("user entered string is :"+s);
		int len = s.length();
		int reovealen = s.replace("z","").length();
		int occranceogfAchar = (len - reovealen);
		System.out.println("given character a occrance is : " +occranceogfAchar);
	}

}
