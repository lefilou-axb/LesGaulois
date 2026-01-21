package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	public Personnage(String nom, int force){
		this.nom = nom;
		this.force = force;
	}
	
	protected abstract String donnerAuteur();
	
	public String getNom() {return nom;}
	
	public int getForce() {return force;}
	
	public void parler(String phrase) {
		System.out.println("Le " + donnerAuteur() + " " + getNom() +" : << " + phrase + " >>.");
	}
	
	public void frapper(Personnage adversaire) {
		System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup au " + adversaire.donnerAuteur() + " " + adversaire.getNom());
		adversaire.recevoirCoup(force/3);
	}
	
	public void recevoirCoup(int coup) {
		this.force = force - coup;
		if(force <= 0) {
			this.force = 0;
			parler("J'abandonne...");
		} else {
			parler("Aïe !");
		}
	}
	
}
