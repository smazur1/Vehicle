

public class Plane extends Vehicle {


	private String howToStop = "";
	private String inVehicle = "In Plane ";
	private String howToFly;
	private String me;


	public Plane() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String stop() {

		howToStop = "Reduce Power, Glide, and use Flaps and Air Brakes";
		return howToStop;
	}

	@Override
	String ridesOn() {
		String travel = "air";
		return travel;
	}

	public String fly() {
		howToFly = "Air flowing around wing generates lift";
		return howToFly;

	}


	public String whoAmI() {
		me = "I am a Plane";
		return me;
	}

}
