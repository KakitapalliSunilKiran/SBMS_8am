package carapp;

public class Car {

	 Engine e;
	 Car(){}
	 Car(Engine e){
		 System.out.println("Hey I am in Constructor method");
		 this.e=e;
	 }
	 
	 
	 public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		 System.out.println("Hey I am in Setter method");
		this.e = e;
	}
	public void startCar() {
		boolean flag = e.startEngine();
		if(flag==true) {
			System.out.println("Car has been started succesfully");
		}else {
			System.out.println("Please restrat the car again");
		}
	 }
}
