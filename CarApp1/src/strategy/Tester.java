package strategy;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car c = new Car(new PetrolEngine());
//		c.startCar(); Constructor Depedency Injection
		
		//Setter dependency Unjection4
		
//		Car c = new Car();
//		c.setE(new PetrolEngine());
//		c.startCar();
		
		//Field Injection
		
		Car c = new Car();
		c.e = new PetrolEngine();
		c.startCar();
		

	}

}
