public class LibriShkollor extends Libri{
	//Klasa libri shkollor eshte extend i klases Libri
	private String drejtimi;
	public LibriShkollor(int i, String t, int vP, String d){
		super(i, t, vP);
		drejtimi = d;
	}
	//Metodat Get dhe Set
	public String getDrejtimi(){return drejtimi;}
	public void setDrejtimi(String d){drejtimi = d;}
	public boolean kaDetyra(){return true;}
	public String toString(){
		return "Libri  Shkollor " + super.toString() + " -> " + drejtimi;
	}
	
}