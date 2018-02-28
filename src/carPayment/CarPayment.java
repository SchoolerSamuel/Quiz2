package carPayment;

public class CarPayment {
		private double totalPrice;
		private double downPay;
		private int period;
		private double interestRate;
		
		public double getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}

		public double getDownPay() {
			return downPay;
		}

		public void setDownPay(double downPay) {
			this.downPay = downPay;
		}

		public int getPeriod() {
			return period;
		}

		public void setPeriod(int period) {
			this.period = period;
		}

		public double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}

		
		public CarPayment(double totalPrice, double downPay, int period, double interestRate) {
			this.totalPrice = totalPrice;
			this.downPay = downPay;
			this.period = period;
			this.interestRate = interestRate;
			
		}
		
		public double monthlyPay() {
			return ((this.getTotalPrice() - this.getDownPay()) * (this.getInterestRate() / 12 )) / (1 - Math.pow(1 + this.interestRate / 12, -1 * this.period));
		
		}
		
		public double totalInterest() {
			return ((this.monthlyPay() * this.period) - this.totalPrice);

		}

}
