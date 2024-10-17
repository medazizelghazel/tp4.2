package tp42;

public class Vendeur extends Salarie {
	private double Vente;
	private double Pourcentage;
	public Vendeur(int matricule, String nom, int recrutement,double vente,double pourcentage ) {
		super(matricule, nom, recrutement);
		this.Vente=vente;
		this.Pourcentage=pourcentage;
	}
	@Override
	public void afficher() {
		super.afficher();
		System.out.println(this);
	}
	
	
	public double Salaire() {
		return super.Salaire() + this.Vente*this.Pourcentage ;
	}

	@Override
	public String toString() {
		return "Vente=" + Vente + ", Pourcentage=" + Pourcentage;
	}



	public double getVente() {
		return Vente;
	}
	public void setVente(double vente) {
		Vente = vente;
	}
	public double getPourcentage() {
		return Pourcentage;
	}
	public void setPourcentage(double pourcentage) {
		Pourcentage = pourcentage;
	}
	

}
