package darkseas;

public class planetFactory {
	
	public Planet makePlanet(String newPlanetType) {
		//Planet newPlanet = null;
		
		if (newPlanetType.equals("terran")) {
			return new terranPlanet();
		} else {
			return null;
		}
	}

}
