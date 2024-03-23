package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this is my first java code
		System.out.println("Welcome to Naveen automation labs");
		
		// data Types --> types of data
		// strict type 
		int x = 10;
		String name = "Ravi";
		
		//String y = 10; // strict type of java
		
		//1.primitive data types
		// Boolean type (true/false)
		
		//Numeric
		
		  // Character type: char
		  // integral type : Integer,Floating point type
		// integer type: Byte,short,int,long
		//floating type: float,double
		
		
		
		
		
		//2.non -primitive data types - need to create the object 
		//String ,array,Interface,Classes..etc
		
		// 1.byte : coming from integer family
		// range -128 to 127
		
		byte a =10;
		byte b = 20;
		b = 30; //updating the value
		b= 40; //updating the value
		// memory will stores in the form of bytes/bits
		// size - 1 byte = 8 bits
		
		byte b1 = 120;
	//	byte b2 = 129; // going into diff range
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b+b1); //160 
		
		  
	//2.short ,size,range
	// size : 2 bytes = 16 bits
	// Range -32,768 to 32,767	
		short s1 = 1234;
		System.out.println(s1);
	
		// 3.integer : Size,range
		//size : 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		int i = 23450;
		int i1 = -999;
		
		int k=1;
		System.out.println(i);
		System.out.println(i1);
		System.out.println(k);
		
		// 4.long size,range
		//size 8 bytes = 64 bits
		//range : -9223372036854775808 to 9223372036854775807
		// population of india, 
		long l = 1000002020;
		
		long g = 123456789011L;
		System.out.println(l);
		System.out.println(g);
		
		// 5.float numbers
		//size,range after . we can enter up to 7 decimal digits
		// size : 4 bytes = 32 bits range 
		float f= 12.33f;
		float f1 = 20.2020f;
		float f2 = (float)34.55;
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1+f2);
		
		// flaot f3
		float f3 = 100;
		System.out.println(f3);
		
		//6.double
		//size,range
		//after . 15 digits its allow
		
		// size 8 bytes = 64 bits
		
		double d= 12.222;
		double d1 = 1.1;
		
		// 7.char
		// size = 2 bytes (16 bits)
		// single digit value.
		char c1 = 'e'; //a-z,A-Z
		char c2 = '2'; // 0-9
		char c3 = '$'; // special chars
		//char c1 = 'a';
		// chinese,uniquee
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3); 
		char c4 = 'A';
		System.out.println(c4); 
		// 100 % - non 
		// java - non primitive data types (any object)
		// not 100 % java oops 
		  
		
		//8 .boolean t/f  
		// size around 1 bit ~1 bit for boolean values
		
		boolean flag = true;
		boolean flag1 = false;
		System.out.println(flag);
		System.out.println(flag1);
		
		
		
		
		
		
		
		
		  
		
		
		
		
		
		

	}

}
