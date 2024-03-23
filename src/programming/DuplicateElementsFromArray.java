package programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[] = {"java","javascript","ruby","java"};
		
		// 1. compare every element and match exist display
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j]))
				System.out.println("duplicate element is :" + names[i]);  
			}
		}
		
		System.out.println("*************************");
		
		
		// time complexicity is O(n*N) -> compare each elemnt compare
		// 2 for loops using O(N*N)
		
		//2. by using hashset - java collection
		// it stores the uniquee values 
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			
			if(store.add(name)== false) {
				System.out.println("duplicate element is :"+ name);			}
		}
		// time complexicity is O(N) -> compare each elemnt compare
				// 1 for loops using O(N)
		System.out.println("*************************");
		
		//3. by using hashmap  
		// it will store the values in key and value pair  in the hashmap
		// duplicate elemts are allowed
		// memtainte one counter and occurance need to count
		// count is > 1 = duplicate array or sting
		
		Map<String,Integer> storemap = new HashMap<String,Integer>();
		for(String name: names) {
			
			Integer count = storemap.get(name);
			if(count == null) {
				storemap.put(name,1);
			}
			else {
				storemap.put(name, ++count);
			}
		}
		
		
		// to print the map values using entryset hashmap values
		
		Set<Entry<String,Integer>> entryset = storemap.entrySet();
		
		for(Entry<String,Integer> entry : entryset) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is : "+ entry.getKey());
			}
			
		}
		// time complexicity is O(2N) -> compare each elemnt compare
		// 1 for loops using O(N)
		

	}

}
