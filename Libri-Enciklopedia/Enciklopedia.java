public class Enciklopedia extends Libri{
	// Klasa Enciklopedia eshte extend i Librit
	private int nrAutoreve;
	// Konstruktori i klases Enciklopedia qe ka vlerat e klases Libri
	public Enciklopedia(int i, String t, int vP, int nrA){
		super(i, t, vP);
		nrAutoreve = nrA;
	}
	// Metodat Get dhe Set
	public int getNrAutoreve(){ return nrAutoreve;  }
	public void setNrAutoreve(int nrA){ nrAutoreve = nrA; }
	public boolean kaDetyra(){ return false; }
	public String toString(){
		return "Enciklopedia " + super.toString() + " ka " + nrAutoreve + " autor";
	}

}