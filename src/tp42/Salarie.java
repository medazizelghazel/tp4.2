package tp42;

public class Salarie {
	protected int Matricule;
	protected String Nom;
	protected int Recrutement;
	public Salarie(int matricule, String nom, int recrutement) {
		super();
		Matricule = matricule;
		Nom = nom;
		Recrutement =  recrutement;
	}
	void afficher() {
		System.out.println("Matricule=" + Matricule + ", Nom=" + Nom + ", Recrutement=" + Recrutement);
	}

	double Salaire() {
		if (Recrutement < 2005) {
			return (400);
		} else {
			return (280);
		}
	}


	public int getMatricule() {
		return Matricule;
	}

	public void setMatricule(int matricule) {
		Matricule = matricule;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getRecrutement() {
		return  Recrutement;
	}

	public void setRecrutement(int recrutement) {
		Recrutement = recrutement;
	}

}
