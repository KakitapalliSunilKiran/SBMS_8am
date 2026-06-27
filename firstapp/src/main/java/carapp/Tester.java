package carapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
		        new ClassPathXmlApplicationContext("beans.xml");
		Car c = ctx.getBean(Car.class);
		c.startCar();
	}

}
//mvn clean install
//Beans configuration in Spring core , how to inject
