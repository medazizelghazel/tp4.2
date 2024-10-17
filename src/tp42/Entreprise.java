package tp42;

public class Entreprise {

	public static void main(String[] args) {
		Salarie[] tabSalarie = new Salarie[5];
		tabSalarie[0] = new Employe(12345, "Walid", 2002, 15, 4);
		tabSalarie[1] = new Vendeur(23445, "Yessine", 2007, 1000, 0.1);
		tabSalarie[2] = new Vendeur(65478, "Nassime", 2000, 700, 0.1);
		tabSalarie[3] = new Employe(87698, "Aymen ", 2003, 19, 5);
		tabSalarie[4] = new Employe(12345, "Khaled", 2008, 7, 4);

		System.out.println("******************************** Liste des Employés*****************************");

		for (Salarie s : tabSalarie) {
			if (s instanceof Employe) {
				s.afficher();
			}
		}
		System.out.println("********************************** Liste des Vendeurs ***************************");
		for (Salarie s : tabSalarie) {
			if (s instanceof Vendeur) {
				s.afficher();
			}
		}
		System.out.println("******************* Nom du salarié le plus ancien dans l'entreprise ********************");

		Salarie PlusAncien = tabSalarie[0];
		for (Salarie s : tabSalarie) {
			if (s.getRecrutement() < PlusAncien.getRecrutement()) {
				PlusAncien = s;
			}
		}
		System.out.println("Nom:" + PlusAncien.getNom() + " recruté en l’an:" + PlusAncien.getRecrutement());
		System.out.println("****************** Matricule du vendeur disposant du plus grand salaire ****************");
		Salarie PlusGrandSalaire = null;
		for (Salarie s : tabSalarie) {
			if (s instanceof Vendeur) {
				PlusGrandSalaire = s;
				for (Salarie p : tabSalarie) {
					if (p instanceof Vendeur) {
						if (p.Salaire() > PlusGrandSalaire.Salaire()) {
							PlusGrandSalaire = p;
						}
					}
				}
				break;
			}
		}
		System.out.println("Matricule:" + PlusGrandSalaire.Matricule + " de salaire:" + PlusGrandSalaire.Salaire());

	}

}
