package darkseas;

public class darkseas {
	public static void main(String[] args) {
		System.out.println("Initializing DarkSeas...");
		
		planetFactory planetFact = new planetFactory();
		
		Planet thePlanet = planetFact.makePlanet("terran");
		
		if(thePlanet != null) {
			System.out.println("Planet is " + thePlanet.getType());
			System.out.println("It's named " + thePlanet.getName());
		}
		
	}
	
}
