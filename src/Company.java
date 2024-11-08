
public class Company extends Client{
	private String location;
	private int poBox;
	private final double DISCOUNT = 0.35;
	
	public Company(String name, String location, int poBox) {
		super(name);
		this.location = location;
		this.poBox = poBox;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPoBox() {
		return poBox;
	}

	public void setPoBox(int poBox) {
		this.poBox = poBox;
	}

	public double getDISCOUNT() {
		return DISCOUNT;
	}

	@Override
	public String toString() {
		return super.toString() + " Location: "+location + " poBox:" + poBox + " DISCOUNT:" + DISCOUNT;
	}
}
