
public class CreditCard implements Payment {
	private double paidAmount;

	public CreditCard(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	@Override
	public String toString() {
		return "CreditCard [paidAmount=" + paidAmount + "]";
	}

	@Override
	public double calcPaymentAmount() {
		return paidAmount*1.25;
	}
	
	
	
	

}
