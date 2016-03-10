
public abstract class Vehicle {

	private int speed = 0;
	private String canStop = "";
	private String canRun = ""; 
	private String inVehicle = "In Vehicle ";


	public Vehicle() {

	}

	public String run() {

		canRun = "Vehicle can run ";
		return canRun;

	}

	public String stop() {

		canStop = "Vehicle can stop ";
		return canStop;
	}

	public int accelerate() {

		speed++;
		return speed;
	}

	abstract String ridesOn();  // abstract method

	abstract String whoAmI();  // abstract method
}

