package carTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import carPayment.CarPayment;

class CarPaymentTest {
	double principle = 35000;
	double downPay = 0;
	int months = 60;
	double interest = 0.10;
	
	@Test
	void test() {
		
		CarPayment myTestCar = new CarPayment(principle, downPay, months, interest);
		
		assertEquals( 743.64, myTestCar.monthlyPay(), .01);
		
		assertEquals( 210000, myTestCar.totalInterest(), 5);
		
	}

}
