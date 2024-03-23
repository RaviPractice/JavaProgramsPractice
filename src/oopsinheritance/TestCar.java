package oopsinheritance;

public class TestCar {

	public static void main(String[] args) {
		
		// create object of bmw
		BMW b = new BMW();
		
		b.start(); //overridden
		b.stop(); //inherited method
		b.refuel(); //inherited method
		b.auto_start(); //individual 
		
		// create object of Car
				Car c = new Car();
				c.start();
				c.stop();
				c.refuel();
			//	c.auto_start();
				
		    
	}

}
