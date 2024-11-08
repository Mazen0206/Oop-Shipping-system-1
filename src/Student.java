
public class Student extends Client{
	private int uniRegId;
	private String uniName;
	private final double DISCOUNT = 0.5;


	public Student(String name, int uniRegId, String uniName) {
		super(name);
		this.uniRegId = uniRegId;
		this.uniName = uniName;
	}


	public int getUniRegId() {
		return uniRegId;
	}


	public void setUniRegId(int uniRegId) {
		this.uniRegId = uniRegId;
	}


	public String getUniName() {
		return uniName;
	}



	public void setUniName(String uniName) {
		this.uniName = uniName;
	}



	public double getDISCOUNT() {
		return DISCOUNT;
	}



	@Override
	public String toString() {
		return super.toString()+" uniRegId=" + uniRegId + " uniName:" + uniName;
	} 
 
	

}
