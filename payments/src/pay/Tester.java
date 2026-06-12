package pay;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		
//       PaymentProcessor pp=new PaymentProcessor(new DebitCard());
//		
//       pp.processPayment();
		
		PaymentProcessor pp=new PaymentProcessor();
//		pp.setIp(new CreditCard());
		
		
		
	//	pp.ip=new CreditCard();
		pp.processPayment();
	}

}



