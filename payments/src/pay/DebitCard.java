package pay;

public class DebitCard implements IPayment {

	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("I am in debit card pay method");
		return false;
	}

}
