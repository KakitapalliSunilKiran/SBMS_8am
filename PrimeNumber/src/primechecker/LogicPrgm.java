package primechecker;

import java.util.Scanner;

public class LogicPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			boolean flag = isPrime(n,2);
			if(flag==true)
			System.out.println("It is a prime number");
			else
			System.out.println("It is not a prime number");
			
	}
	static boolean isPrime(int n,int i) {
		if(n<=1) {
			return false;
		}
		if(i>n/2) {
			return true;
		}
		if(n%i==0) {
			return false;
		}
		return isPrime(n,i+1);
	}

}
