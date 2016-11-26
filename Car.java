public class Car {
	private String color;
	private int horsePower;
	private double engineSize;
	private String make;
	/**
		initialize values of Car's instance variables or the attributes
	*/
	public Car() {
		this( "white", 250, 4.0, "Black");			
	}
	public Car(String color, int horsePower, double engineSize, String make) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
			
	}
	public void setColor(String color) {
		this.color = color;			
	}
	public void setHorsePower(int hoursePower) {
		this.horsePower = horsePower;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}	
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor(){
		return color;
	}	
	public int getHorsePower() {
		return horsePower;
	}
	public double getEngineSize(){
		return engineSize;
	}
	public String getMake() {
		return make;
	}
	public String toString() {
		return "Color " + color + " horse Power " + horsePower + " engine size " + engineSize + " make " + make;
	}
}
