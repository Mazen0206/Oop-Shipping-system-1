import java.util.*;

public class TestApp {

	static ArrayList <Client> Clients = new ArrayList <Client>();
	static ArrayList <Destination> destinations = new ArrayList <Destination>();
	static ArrayList <Shipment> shipments = new ArrayList <Shipment>();
	static ArrayList <ShipmentStatus> shipmentStatus = new ArrayList <ShipmentStatus>();



	public static void main(String[] args) {
			MainMenu();
			System.out.println(Clients);
			System.out.println(destinations);
	}

	public static void MainMenu() {
		Scanner input = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Choose one of the next options: \n\n" + ""
					+ "1. Add Client\n"
					+ "2. Add Destination\n"
					+ "3. Create new shipment\n"
					+ "4. Update an existing shipment\n"
					+ "5. Sending/Receiving shipment\n"
					+ "6. Report1- List the existing clients \n"
					+ "7. Report2- List the destination details \n"
					+ "8. Report3- List the shipment details \n"
					+ "9. Report4- List the queued shipments \n"
					+ "10. Report5- List the client shipments \n"
					+ "11. Report6- List the income\n"
					+ "12. Report7- List the shipments not yet collected \n"
					+ "13. save and exit");
			choice = input.nextInt();
		}
		while (choice < 1 || choice > 13);
		
		if(choice==1) { 
			chooseType();
		}
		else if (choice==2) {
			AddDestination();
		}
	}
	public static void chooseType() { 
		Scanner input1 = new Scanner(System.in);
		int choice1;
		do {
		System.out.print(
				"Choose one of the next options: \n\n"
						+ "1. Add Client\n"
						+ "2. Add Student\n"
						+ "3. Add Company\n"
						+ "4. Add Staff\n");
		choice1 = input1.nextInt();
		}
		while(choice1<1 || choice1>4);
		if(choice1==1) {
			AddClient();
		} else if (choice1 == 2) {
			AddStudent();
		} else if (choice1 == 3) {
			AddCompany();
		} else if (choice1 == 4) {
			AddStaff();
		}

	}

	public static void AddClient(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		Client c = new Client(name);
		Clients.add(c);
		MainMenu();
	}


	public static void AddStudent() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Enter your University name: ");
		String UniName = input.nextLine();
		System.out.println("Enter your University Regitration ID: ");
		int uniRegId =input.nextInt();
		Student s=new Student(name,uniRegId,UniName);
		Clients.add(s);
		MainMenu();

	}
	public static void AddCompany() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		System.out.println("Enter your Location: ");
		System.out.println("Enter your PoBox:  ");
		String name = input.next();
		String location = input.next();
		int PoBox =input.nextInt();
		Company s=new Company(name,location,PoBox);
		Clients.add(s);
		MainMenu();

	}
	public static void AddStaff() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		System.out.println("Enter your Job ID: ");
		String name = input.next();
		String JobId = input.next();
		Staff s=new Staff(name,JobId);
		Clients.add(s);
		MainMenu();

	}
	public static void AddDestination() {	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Destination name: ");
		System.out.println("Enter your Air Cost for First Kilogram: ");
		System.out.println("Enter your Air cost for Each Added Half: ");
		System.out.println("Enter your Ground Shipping Discount: ");
		System.out.println("Enter your Sea Shipping Discount:  ");
		String destname = input.next();
		double acfk = input.nextDouble();
		double acfh = input.nextDouble();
		double gsd = input.nextDouble();
		double ssd = input.nextDouble();
		Destination d = new Destination(destname, acfk, acfh, gsd, ssd);
		destinations.add(d);
		MainMenu();
	}
	
	public static void Addshipment() {	
		Scanner input = new Scanner(System.in);
		if (Shipment.check()) {
			//double weight, double shippingCost, Client shipper,
			//Destination destination, ShippingWays shippingWay, Payment[] paymentWay
			System.out.println("Enter your the weight of the shipment: ");
			double weigh = input.nextDouble();
			System.out.println("Enter your Client ID: ");
			int clientId = input.nextInt();
			System.out.println("Enter your Destination Code: ");
			String destcode = input.next();
			System.out.println("Enter your Shipping way: ");
			String shipway = input.next();
			System.out.println("Enter your Payment way: ");
			String paymentway = input.next();



		}
	}


}