package programming;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using split method 
		String str ="Wel come to performance testing";
		String strar[] = str.split(" ");
		System.out.println("the no of words in a given string is :" +strar.length);
		
		// use scanner class to take input the string
		/*
		 * System.out.println("enter the string:"); Scanner sc = new Scanner(System.in);
		 * String s = sc.nextLine(); int count=1; for(int i=0;i<s.length()-1;i++) { if
		 * ((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){ count++;
		 * 
		 * } }
		 * 
		 * System.out.println("number of words in a given string is :"+count);
		 */
	}

}
