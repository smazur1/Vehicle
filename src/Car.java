
public class Car extends Vehicle {


	private String howToStop = "";
	private String inVehicle = "In Car ";
	private String me;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String stop() {

		howToStop = "Brake the wheels";
		return howToStop;
	}

	@Override
	String ridesOn() {
		String travel = "roads";
		return travel;
	}

	public String whoAmI() {
		me = "I am a Car";
		return me;
	}

}
