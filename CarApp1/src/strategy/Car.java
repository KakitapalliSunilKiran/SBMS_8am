package strategy;

public class Car 
{
	Engine e;
	Car(){
		
	}
	Car(Engine e){
		this.e=e;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	
	void startCar() {
		boolean flag = e.start();
		if(flag==true) {
			System.out.println("Car has been started ");
		}else {
			System.out.println("The car has been failed to start");
		}
	}
}
