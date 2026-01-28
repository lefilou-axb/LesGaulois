package sites;

import personnages.Gaulois;

public class Village{
	private Gaulois chef;
	private Gaulois villageois[];
	private int indiceTab = 0;
	
	public Village(Gaulois chef) {
		this.chef = chef;
	}
	
	public Gaulois getChef() {return chef;}
	
	public void ajouterVillageois(Gaulois newSoldat){
		this.villageois[this.indiceTab] = newSoldat;
		System.out.println(this.villageois);
	}
	
}
