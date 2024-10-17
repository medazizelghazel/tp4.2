package tp42;

public class Employe extends Salarie  {
	private double Hsupp;
	private double PHsupp;
	public Employe(int Matricule,String Nom,int Recrutement,double hsupp,double phsupp) {
		super(Matricule, Nom, Recrutement);
		Hsupp=hsupp;
		PHsupp=phsupp;
	}
	@Override
	public void afficher() {
		super.afficher();
		System.out.println(this);
	}
	double Salaire() {
		return super.Salaire() + this.Hsupp * this.PHsupp ;
	}
	@Override
	public String toString() {
		return "Hsupp=" + Hsupp + ", PHsupp=" + PHsupp;
	}

	public double getHsupp() {
		return Hsupp;
	}
	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}
	public double getPHsupp() {
		return PHsupp;
	}
	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}
	
	
}
