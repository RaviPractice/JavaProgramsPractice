package JavaSessions;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Selenium";
		
		String t = s + "java";
		System.out.println(t); //javaselenium
		System.out.println(s); // Selienium
		
		
		String s1 = "Java";
		System.out.println(s1+"python"); //Javapython
		System.out.println(s1); //Java
		
		s1 = s1 + "Automation";
		System.out.println(s1); // JavaAutomation
		
		String U = "Java";
		
		// mutabale classes
		
		//StringBuilder (1.5),StringBuffer (1.0) are mutable classes
		
		StringBuilder sb = new StringBuilder("Selenium");
		System.out.println(sb); //Selenium
		sb.append("Testing");
		System.out.println(sb); //SeleniumTesting
		
		// lot of manipulations,we also go with string builder or stringbuffer
		// no manipulations go with string class
		
		String pop = "   Submit    ";
		pop.trim();
		System.out.println(pop);// Submit
		
		
		
		
		
		
		
		
		
	}

}
