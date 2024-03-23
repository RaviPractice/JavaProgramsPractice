package programming;

public class CountTheWordsInString {

	public static void main(String[] args) {
		
		getNoOfWordsInString("hjello java selenium python test");
		
		/*
		 * String s= " python hello Hello java programe"; int count=1; for(int
		 * i=0;i<s.length()-1;i++) {
		 * 
		 * if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) { count++; } }
		 * System.out.println("number of wordds in a string is :" +count);
		 */
	}
	public static void getNoOfWordsInString(String val) {
		String s=val;
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!= ' ')) {
				count++;
			}
		}
		System.out.println("no of words in a string :" +count);
	}

}
