package immigration;

public abstract class LandVehicle {

	private String licensePlate;
	private String brand;
	private String model;
	private int maxPassenger;
	private int maxCargo;
	private String driverName;
	private boolean permitted;
	
	public LandVehicle(String licensePlate, String brand, String model, int maxPassenger, int maxCargo,
			String driverName, boolean permitted) {
		super();
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.model = model;
		this.maxPassenger = maxPassenger;
		this.maxCargo = maxCargo;
		this.driverName = driverName;
		this.permitted = permitted;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public int getMaxPassenger() {
		return maxPassenger;
	}
	
	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}
	
	public int getMaxCargo() {
		return maxCargo;
	}
	
	public void setMaxCargo(int maxCargo) {
		this.maxCargo = maxCargo;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public boolean isPermitted() {
		return permitted;
	}
	
	public void setPermitted(boolean permitted) {
		this.permitted = permitted;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
