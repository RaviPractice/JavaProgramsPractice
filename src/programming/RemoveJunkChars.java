package programming;

public class RemoveJunkChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeJunkCharsFromString("Hello #%%$$%#% DRWSSS #@$%%%#");
		
		/*
		 * //using regular expression with replaceAll String str =
		 * "@#$&&&* java selinium python @&$4"; str=str.replaceAll("[^a-zA-Z0-9]", "");
		 * System.out.println(str);
		 */
	}
	
	public static void removeJunkCharsFromString(String value) {
		String s1 = "Hello #%%$$%#% DRWSSS #@$%%%#";
		System.out.println("before remove junk chars is :"+s1);
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("after remove junk chars is :"+s1);
	}

}
