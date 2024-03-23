package collectionConcept;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList --> default class
		//create object of arraylist

		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100); //0
		ar.add(200); // 20
		System.out.println(ar.size());
		// size method it will give the size of the array
		//default size is 0
		
		//get() --> get the value of the index position
		
	//	System.out.println(ar.get((2))); // IndexOutOfBoundsException
	//	System.out.println(ar.get(-1)); // IndexOutOfBoundsException
		
		
		ar.add((500));
		System.out.println(ar.get(2));
		
		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		ar.add("Ravi");
		System.out.println(ar.size());// 
		
		// generics in arraylist(student marks)
		
		ArrayList<Integer> marksList = new ArrayList<>(); // vc=10,pc=0
		marksList.add(100);
		marksList.add(200);
		System.out.println(marksList.size()); // 2
		
		ArrayList<Double> bmiList = new ArrayList<>();
		bmiList.add(12.33);
		bmiList.add(100.00);
		
		ArrayList<String> browserList = new ArrayList<>();
		
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("safari");
		browserList.add("opera");
		System.out.println(browserList.size()); //4
		
		System.out.println(browserList.get(1));
		
		System.out.println(browserList); // it will print arraylist browser valus
		
		// print all the values from arraylist
		
		for(int i=0;i<browserList.size();i++) {
			System.out.println(browserList.get(i));
			if(browserList.get(i).equals("firefox")) {
				System.out.println("mozilla");
				break;
			}
		} 
		
		System.out.println("-------------");
		//for each loop
		
		for(String e :browserList) {
			System.out.println(e);
		}  
		
		
		    // to store employee details
		// name,age,sal,address,gender,temp/pernment
		
		ArrayList<Object> empInfo = new ArrayList<Object>(); //pc =0,vc=10
		empInfo.add("Riya");
		empInfo.add("Singh");
		empInfo.add(30);
		empInfo.add('f');
		empInfo.add("hyd");
		empInfo.add(45.55);
		empInfo.add(true);
		
		System.out.println(empInfo.size());
		
		// to print emp information
		
		for(Object e : empInfo) {
			System.out.println(e);
		}
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(); //pc =0,vc=10
		
		// generics should always be part of non-primitive data types
		
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(100); // duplicate values allowed
		numbers.add(null); // null values 
		
		System.out.println(numbers);
		
		for(Integer e: numbers) {
			System.out.println(e);
			if(e==200) {
				System.out.println("200 matching");
			}
		}
		
		// we can use it
		  
	}

}
