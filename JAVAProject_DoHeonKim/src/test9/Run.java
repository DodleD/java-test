package test9;

public class Run {

	public static void main(String[] args) {
		Plane p = new Airplane("L747",1000);
		Plane c = new Cargoplane("C40",1000);
		
		System.out.println("Plane\t\tfuelSize");
		System.out.println("----------------------");
		System.out.println(p.toString());
		System.out.println(c.toString());
		System.out.println("100 운항");
		
		System.out.println("Plane\t\tfuelSize");
		System.out.println("----------------------");
		p.flight(100);
		c.flight(100);
		System.out.println(p.toString());
		System.out.println(c.toString());
		System.out.println("200 주유");
		p.refuel(200);
		c.refuel(200);
		System.out.println("Plane\t\tfuelSize");
		System.out.println("----------------------");
		System.out.println(p.toString());
		System.out.println(c.toString());
		
		
		
		
	}

}
