
public class VehicleApp {

	public static void main(String[] args) {

		Car c = new Car();
		Boat b = new Boat();
		Plane p = new Plane();

		System.out.println(c.whoAmI());
		System.out.println(c.run());

		System.out.println(c.stop());

		System.out.println(c.ridesOn());

		System.out.println("Speed = " + c.accelerate());

		System.out.println();

		//		
		System.out.println(b.whoAmI());
		System.out.println(b.run());

		System.out.println(b.stop());

		System.out.println(b.ridesOn());

		System.out.println("Speed = " + b.accelerate());

		System.out.println();

		//	
		System.out.println(p.whoAmI());
		System.out.println(p.run());

		System.out.println(p.stop());

		System.out.println(p.ridesOn());

		System.out.println("Speed = " + p.accelerate());

		System.out.println(p.fly());

		System.out.println();
		//
	

		

	

	}
}
