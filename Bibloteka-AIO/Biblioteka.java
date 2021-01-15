public class Biblioteka{
	//Klasa Bibloteka permban te dhenat mbi librat , enciklopedite poashtu edhe te dhenat e autoreve te librave
	private String emri;
	private Libri[] librat;
	private int index = 0;
	//Konstruktori
	public Biblioteka(String emrat, int nrLibrave){
		emri = emrat;
		librat = new Libri[nrLibrave];
	}
	//Ne rast se ne nuk japim ndonje kriter pra "null"
	public boolean ekziston(Libri l){
		if(l == null){
			System.out.println("Libri eshte i pa inicializuar!");
			return false;
		}
		for(int i =0; i < index; i++){
			if(librat[i].equals(l))
				return true;
		}
		return false;
	}
	// Kur kerkojm librat mirpo kriteri i kerkimit eshte "null"
	public void shtoLibrin(Libri l){
		if(l == null){
			System.out.println("Libri eshte i pa inicializuar!");
			return;
		}
		if(index == librat.length){
			System.out.println("Nuk ka hapsire ne varg!");
			return;
		}
		// Kur libri ekziston brena vargut
		if(ekziston(l)){
			System.out.println("Libri ekziston !");
			return;
		}
		librat[index++] = l;
	}
	//Kur kerkojme ne baze te numrit te faqeve
	public Enciklopedia maxNumriFaqeve(){
		if(index == 0){
			System.out.println("Nuk ka asnje liber qe perputhet!");
			return null;
		}
		Enciklopedia temp = null;
		for(int i = 0; i < index; i++){
			if(librat[i] instanceof Enciklopedia){
				Enciklopedia e = (Enciklopedia)librat[i];
				if(temp == null || temp.getNrFaqeve() <= e.getNrFaqeve())
					temp = e;
			}
		}
		// kur kerkojme enciklopedi mirpo kriteri i kerkeses eshte "null"
		if(temp == null)
			System.out.println("Nuk ka asnje enciklopedi qe perputhet!");
		return temp;
	}
	
	public LibriShkollor libriDrejtimit(String d){
		if(index == 0){
			System.out.println("Nuk ka asnje liber qe perputhet!");
			return null;
		}
		LibriShkollor l = null;
		for(int i = 0; i <  index; i++){
			if(librat[i] instanceof LibriShkollor){
				l = (LibriShkollor)librat[i];
				if(l.getDrejtimi().equals(d))
					return l;
			}
		}
		if(l == null)
			System.out.println("Nuk ka asnje Liber Shkollor qe perputhet!");
		else
			System.out.println("Nuk ka asnje Liber Shkollor me kete drejtim qe perputhet!");
		return l;
	}
	
	public void shtypKopertinat(boolean k){
		for(int i = 0; i < index; i++){
			if(librat[i] instanceof Botohet){
				Botohet b = (Botohet)librat[i];
				if(b.kaKopertina() == k)
					System.out.println(b);
			}
		}
	}
	// Te dhenat e librave te Biblotekes
	public static void main(String[] args){
		Biblioteka b = new Biblioteka("Libraria", 50);
		LibriShkollor l1 = new LibriShkollor(00001, "Java Learning", 2, "SHMU-1");
		l1.shtoAutorin(new Autori(001, "Murat", "Mehmeti"));
		l1.shtoAutorin(new Autori(002, "Donat", "Osmani"));
		b.shtoLibrin(l1);
		LibriShkollor l2 = new LibriShkollor(00002, "Java Enterprise", 1, "SHMU-2");
		l2.shtoAutorin(new Autori(003, "Gentrit", "Shaqiri"));
		b.shtoLibrin(l2);
		Enciklopedia e1  = new Enciklopedia(00003, "Java Advanced", 1, 800);
		e1.shtoAutorin(new Autori(004, "Asllan", "Behiri"));
		Enciklopedia e2  = new Enciklopedia(00004, "Java OOP", 2, 200);
		e2.shtoAutorin(new Autori(005, "Besnik", "Aliu"));
		e2.shtoAutorin(new Autori(006, "Saranda", "Ahmeti"));
		Enciklopedia e3  = new Enciklopedia(00005, "Java Base Structure", 1, 600);
		e3.shtoAutorin(new Autori(007, "Albnora", "Sahiti"));
		b.shtoLibrin(e1);
		b.shtoLibrin(e2);
		b.shtoLibrin(e3);
		System.out.println();
		System.out.println("Numri i Faqeve Maksimale :\n" + b.maxNumriFaqeve());
		System.out.println();
		System.out.println("Drejtimi \"SHMU 1\":\n" + b.libriDrejtimit("SHMU 1"));
		System.out.println();
		System.out.println("Librat qe kane kopertina:");
		b.shtypKopertinat(true);
		System.out.println();
	}
}