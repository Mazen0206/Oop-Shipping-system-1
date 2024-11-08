
public class Destination {
	private static int inc;
	private String destCode;
	private String destName;
	private double airCost1stKilo;
	private double airCostEachAddHalf;
	private double groundShippingDiscount;
	private double seaShippingDiscount;

	public Destination(String destName, double airCost1stKilo, double airCostEachAddHalf, double groundShippingDiscount,
			double seaShippingDiscount) {
		super();
		inc++;
		this.destCode = DestCode();
		this.destName = destName;
		this.airCost1stKilo = airCost1stKilo;
		this.airCostEachAddHalf = airCostEachAddHalf;
		this.groundShippingDiscount = groundShippingDiscount;
		this.seaShippingDiscount = seaShippingDiscount;
	}

	public String DestCode() {
		String Dest = "Dest";
		int num = 1000;
		num += inc;
		Dest += num;
		return Dest;
	}

	public String getDestCode() {
		return destCode;
	}

	public String getDestName() {
		return destName;
	}

	public void setDestName(String destName) {
		this.destName = destName;
	}

	public double getAirCost1stKilo() {
		return airCost1stKilo;
	}

	public void setAirCost1stKilo(double airCost1stKilo) {
		this.airCost1stKilo = airCost1stKilo;
	}

	public double getAirCostEachAddHalf() {
		return airCostEachAddHalf;
	}

	public void setAirCostEachAddHalf(double airCostEachAddHalf) {
		this.airCostEachAddHalf = airCostEachAddHalf;
	}

	public double getGroundShippingDiscount() {
		return groundShippingDiscount;
	}

	public void setGroundShippingDiscount(double groundShippingDiscount) {
		if (this.groundShippingDiscount > 0 && this.groundShippingDiscount < 1)
			this.groundShippingDiscount = groundShippingDiscount;
		else
			this.groundShippingDiscount = 0;
	}

	public double getSeaShippingDiscount() {
		return seaShippingDiscount;
	}

	public void setSeaShippingDiscount(double seaShippingDiscount) {
		if (this.seaShippingDiscount > 0 && this.seaShippingDiscount < 1)
			this.seaShippingDiscount = seaShippingDiscount;
		else
			this.seaShippingDiscount = 0;
	}

	public double calcAirCost(double weigh) {
		double finalweigh=0;
		double finalcost=0;

		if (weigh<1 && weigh>0) {
			finalweigh=1;
			finalcost=this.getAirCost1stKilo();
		}
		else if(weigh>1) {
			finalweigh=weigh-1;
			double scaledValue = weigh * 2;
			double roundedScaledValue = Math.round(scaledValue);
			double w=roundedScaledValue/2;
			finalcost=this.getAirCost1stKilo()+(this.getAirCostEachAddHalf()*w);
		}
		return finalcost;
	}

	public double calcGroundCost(double aircost) {
		double groundCost = aircost-(aircost*this.getGroundShippingDiscount());
		return groundCost;
	}

	public double calcSeaCost(double aircost) {
		double seaCost = aircost-(aircost*this.getSeaShippingDiscount());
		return seaCost;
	}

	@Override
	public String toString() {
		return "Destination [destCode=" + destCode + ", destName=" + destName + ", airCost1stKilo=" + airCost1stKilo
				+ ", airCostEachAddHalf=" + airCostEachAddHalf + ", groundShippingDiscount=" + groundShippingDiscount
				+ ", seaShippingDiscount=" + seaShippingDiscount + "]";
	}

}
