package pay;

public class PaymentProcessor {
    IPayment ip;
    PaymentProcessor(){}
    PaymentProcessor(IPayment ip){
    	this.ip=ip;
    }
    
    public void setIp(IPayment ip) {
		this.ip = ip;
	}
    
    void processPayment() {
    	boolean flag=ip.pay(2345);
    	if(flag==true) {
    		System.out.println("Payment has completed");
    	}else {
    		System.out.println("Payment has failed");
    	}
    }


	
}
