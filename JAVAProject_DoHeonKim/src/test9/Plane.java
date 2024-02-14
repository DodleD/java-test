package test9;

abstract public class Plane {
	private String planeName;
	private int fuelSize;
	
	
	public Plane() {
		super();
	}


	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		this.fuelSize +=fuel;
	}
	
	abstract public void flight(int distance) ;


	
	
	
	
	
	@Override
	public String toString() {
		return planeName + "\t\t" + fuelSize;
	}


	protected String getPlaneName() {
		return planeName;
	}


	protected void setPlaneName(String planeName) {
		this.planeName = planeName;
	}


	protected int getFuelSize() {
		return fuelSize;
	}


	protected void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	
	
	
	
}
