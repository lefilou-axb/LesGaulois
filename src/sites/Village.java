package sites;

import personnages.Gaulois;

public class Village extends Gaulois {
	private String chef;
	
	public Village(String nom, int force) {
		super(nom, force);
		this.chef = "Chef";
	}
}
