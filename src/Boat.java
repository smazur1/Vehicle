

public class Boat extends Vehicle {


	private String howToStop = "";
	private String inVehicle = "On Boat ";
	private String me;

	public Boat() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String stop() {

		howToStop = "Reverse the propeller";
		return howToStop;
	}

	@Override
	String ridesOn() {
		String travel = "water";
		return travel;
	}

	public String whoAmI() {
		me = "I am a Boat";
		return me;
	}
}

