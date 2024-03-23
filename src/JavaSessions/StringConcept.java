package JavaSessions;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// string literals - scp
		
		String s1= "Hello"; // heap,stack (heap --> scp)
		String s2 = "Hello"; // scp --> hello (refrences-->s1,s2)
		String s3 = "hello";
		//scp - inside scp cannot allow duplicate value
		System.out.println(s1==s2); // true
		System.out.println(s1==s3); //false
		
		
		// string object with new keyword
		
		String str = new String ("java"); // heap memory create one object str
		String str1 = new String ("hello"); // heap memory create one object str1
		String str2 = new String ("hello");
		
		
		System.out.println(str==str1); // false
		System.out.println(str.equals(str1)); // true
		System.out.println(str1==str2); // false
		System.out.println(str1.equals(str2)); // true 
		
		String test = new String ("selenium"); // test object created in heap memory(1)
		test.intern(); // the same duplicate value is created in scp (1)
		String t1 = "selenium" ; // no duplicate values in scp (0- object),no refrence
		
		//total no of objects are 2 in line no 30-32
		
		String st2 = new String();
		System.out.println(st2.length()); //0
		
		// string is immutable objects -> value ogf the string cannot be change.
		
		
		
		
		
		
		
		
		
		
		// string comparision we canot use == operator
		// for strings we can use equals operator
		
		int i = 10;
		int j = 10;
		int k = 10;
		
		
		
		
		
		
		
		
		
		
		

	}

}
