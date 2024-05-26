package myPackage;

public class HazardPay extends PayCalculator {
	public HazardPay(double payRate) {
		this.payRate = payRate;
	}
	
	public double computePay(double hours) {
		return super.computePay(hours)*1.5;
	}
}
