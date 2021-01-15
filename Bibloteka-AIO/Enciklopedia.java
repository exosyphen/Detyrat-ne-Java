public class Enciklopedia extends Libri implements Botohet{
	//Klasa Enciklopedia eshte extend i librit mirpo implementon edhe klasen Botohet
	private int nrFaqeve;
	// Konstruktori qe perfshin te dhenat nga klasa libri
	public Enciklopedia(int i, String t, int nrA, int nrFaqe){
		super(i, t, nrA);
		nrFaqeve = nrFaqe;
	}
	public int getNrFaqeve(){return nrFaqeve;}
	public void setNrFaqeve(int nrF){nrFaqeve = nrF;}
	public void shtoAutorin(Autori a){
		if(a == null){
			System.out.println("Autor i pa inicializuar!");
			return;
		}
		if(index == autoret.length){
			System.out.println("Nuk ka vend!");
			return;
		}
		if(exists(a)){
			System.out.println("Libri ka kete autore !");
			return;
		}
		autoret[index++] = a;
	}
	public boolean exists(Autori a){
		if(a == null){
			System.out.println("Autor i pa inicializuar!");
			return false;
		}
		for(int i = 0; i < index; i++)
			if(autoret[i].equals(a))
				return true;
		return false;
	}
	//Vlerat qe implementohen nga klasa Botohen
	public boolean kaKopertina(){return true;}
	public boolean kaUshtrime(){return false;}
	public String toString(){ 
		return "Enciklopedia " + super.toString() + " ka " + nrFaqeve + " faqe";
	}
	
}