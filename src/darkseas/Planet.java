package darkseas;

import java.util.ArrayList;
import java.util.Random;

public class Planet {
	private String name;
	private String type;
		
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String newType) {
		if(newType.equals(null)) {
			type = getRandomType();
		} else {
			type = newType;
		}
	}
	
	public String getRandomType() {
		ArrayList<String> planetTypes = new ArrayList<String>();
		planetTypes.add("terran");
		planetTypes.add("dead");
		planetTypes.add("gas giant");
		
		Random rand = new Random();
		String randomType = planetTypes.get(rand.nextInt(planetTypes.size()));
		
		return randomType;
		
	}

}
