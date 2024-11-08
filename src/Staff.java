
public class Staff extends Client {
	private String jobId;
	private final double DISCOUNT =0.75;

	public Staff(String name, String jobId) {
		super(name);
		this.jobId = jobId;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public double getDISCOUNT() {
		return DISCOUNT;
	}
	@Override
	public String toString() {
		return super.toString()+" job Id:" + jobId + " DISCOUNT=" + DISCOUNT;
	}
}
