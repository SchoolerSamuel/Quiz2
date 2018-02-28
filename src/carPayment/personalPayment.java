package carPayment;
import java.util.Scanner;

public class personalPayment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please give the principle amount, your downpayment, the loan duration, and the intrest rate, seperate each with a space.");
		double princible = input.nextDouble();
		double downPay = input.nextDouble();
		int period = input.nextInt();
		double interestRate = input.nextDouble();
		
		CarPayment myCar = new CarPayment(princible, downPay, period, interestRate);
		
		System.out.println("Your monthly payment is: " + myCar.monthlyPay());
		System.out.println("Your total interest is: " + myCar.totalInterest());
		
		
	}
}
