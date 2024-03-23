package programming;

public class ReverseOfEachWordInString {
	
	public static void getReverseWords(String val) {
		String s = val;
		System.out.println("before string reverse words: "+s);
		String words[] = s.split(" ");
		
		String strrev="";
		for(String w : words) {
			String strwords="";
			for(int i=w.length()-1;i>=0;i--) {
				strwords = strwords+ w.charAt(i);
			}
			strrev = strrev + strwords + " "; 
		}
		System.out.println("after string reverse words are :"+strrev);
	}

	public static void main(String[] args) {
		
		getReverseWords("Hello java selenium testng git gitbash maven");
		/*String s = "Hello Java world";
		String words[] = s.split(" ");
		String revstring = "";  

		for (String w : words) {
			String reverseword = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseword = reverseword + w.charAt(i);
			}
			revstring = revstring + reverseword + " ";
		}

		System.out.println("reverse string is : " + revstring);
	*/
	}

}
