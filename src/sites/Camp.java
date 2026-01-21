package sites;

import personnages.Soldat;

public class Camp extends Soldat{
	private String commandant;
	
	public Camp(String nom, int force, String grade){
		super(nom, force, grade);
	}
}
