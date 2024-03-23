package oopsinheritance;

public class BMW extends Car{
	
	// method overriding concept : poly + morphisam (many forms) - runtimepolymorphisam,dynamic polymorphisam.
	
	//  when you have method in paraent class,the same method in child class 
	// same name
	//same type of parameters
	//same no of parameters
	//same sequence 
	
	@Override
	public void start() {
		System.out.println("bmw-start");
	}
	public void auto_start() {
		System.out.println("bmw-autostart");
	}  

}  
  