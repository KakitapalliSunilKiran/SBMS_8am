package pay;

public class CreditCard implements IPayment{

	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("I am in credit card pay method");
		return false;
	}

}
