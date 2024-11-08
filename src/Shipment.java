import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Shipment {
	private static int inc=1000; 
	private String ShipmentCode;
	private LocalDate registrationDate;
	private double weight;
	private double shippingCost;
	private Client shipper;
	private Destination destination;
	private ShippingWays shippingWay;
	private Payment[] paymentWay;
	
	public Shipment(double weight, double shippingCost, Client shipper,
			Destination destination, ShippingWays shippingWay, Payment[] paymentWay) {
		super();
		this.ShipmentCode = shipCode();
		this.registrationDate=todayDate();
		this.weight = weight;
		this.shippingCost = shippingCost;
		this.shipper = shipper;
		this.destination = destination;
		this.shippingWay = shippingWay;
		this.paymentWay = paymentWay;
	}
	public String shipCode() {
		String ship = "ship";
		int num = 1000;
		num += inc;
		ship += num;
		return ship;
	}
	public LocalDate todayDate() {
		LocalDate today = LocalDate.now();
		return today;
		}
	public static boolean check() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Clinet ID");
		int clientID= input.nextInt();
		System.out.println("Enter your destination code");
		String destcode = input.next();
		if(TestApp.Clients.contains(clientID)&&TestApp.destinations.contains(destcode)) {
			return true;

		}
		else {
			return false;

		}
	}
	public void paymentType() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the type you wnat to pay with:\n"
				+ "1. Postponed it till later"
				+ "2. Payed in patial"
				+ "3. Payed in total");
		int choice = input.nextInt();
		if (choice==1) {
			System.out.println("Ok the payment will be postponed");
		}
		else if (choice == 2) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("Enter the payment amount");
			double payamount = input1.nextDouble();
			double total = this.shippingCost-payamount;
			System.out.printf("you paid %.2f of the total amount: %.2f",payamount,total);
		}
		else if (choice==3) {
			Scanner input1 = new Scanner(System.in);
			System.out.printf("Enter the full amount which is %.2f",this.shippingCost);
			double total2 = input.nextDouble();
			System.out.printf("thank you paying the full amount "+total2);

		}
	}
	public double calcShippingCost() {
		Scanner input = new Scanner(System.in);
		System.out.printf("The shipping cost for this shipment by air is %.2f\n "
				+ " if you want to ship by ground enter 'Ground'\n"
				+ " if you want to ship by sea enter 'Sea'\n"
				+ " if you want to ship by air enter 'Air'",calcAirCost());

		System.out.println("shipping method:");
		String shipway = input.next();

		if (shipway.equalsIgnoreCase("sea")){
			return calcSeaCost();
		}
		else if (shipway.equalsIgnoreCase("ground")){
			return calcGroundCost();
		}
		else shipway.equalsIgnoreCase("air");{
			return calcAirCost();
		}

	}

	public double calcAirCost() {
		return this.getDestination().calcAirCost(this.getWeight());
	}
	public double calcSeaCost() {
		return this.getDestination().calcSeaCost(this.getWeight());
	}
	public double calcGroundCost() {
		return this.getDestination().calcGroundCost(this.getWeight());
	}

	public String getShipmentCode() {
		return ShipmentCode;
	}


	public LocalDate getRegistrationDate() {
		return registrationDate;
	}


	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public Client getShipper() {
		return shipper;
	}

	public void setShipper(Client shipper) {
		this.shipper = shipper;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public ShippingWays getShippingWay() {
		return shippingWay;
	}

	public void setShippingWay(ShippingWays shippingWay) {
		this.shippingWay = shippingWay;
	}

	public Payment[] getPaymentWay() {
		return paymentWay;
	}

	public void setPaymentWay(Payment[] paymentWay) {
		this.paymentWay = paymentWay;
	}

	@Override
	public String toString() {
		return "Shipment [ShipmentCode=" + ShipmentCode + ", registrationDate=" + registrationDate + ", weight="
				+ weight + ", shippingCost=" + shippingCost + ", shipper=" + shipper + ", destination=" + destination
				+ ", shippingWay=" + shippingWay + ", paymentWay=" + Arrays.toString(paymentWay) + "]";
	}
	

}
