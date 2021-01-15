public abstract class Libri{
	// Klasa Abstrakte Libri me 3 atribute private
	private int isbn;
	private String titulli;
	private int vitiPublikimit;
	// Konstruktori i klases Libri
	public Libri(int i, String t, int vP){
		isbn = i;
		titulli = t;
		vitiPublikimit = vP;
	}
	// Metodat Get dhe Set
	public int getIsbn(){return isbn;}
	public String getTitulli(){return titulli;}
	public int getVitiPublikimit(){return vitiPublikimit;}
	public void setTitulli(String t){titulli = t;}
	public void setVitiPublikimit(int vP){vitiPublikimit = vP;}
	public abstract boolean kaDetyra();
	
	// Paraqitja e te dhenave
	public String toString(){
		return isbn + "  -> " + titulli + " - " +  vitiPublikimit;
	}
	public boolean equals(Object o){
		return (o instanceof Libri) ? isbn == ((Libri)o).getIsbn() : false;
	}
}