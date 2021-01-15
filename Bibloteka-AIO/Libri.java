public abstract class Libri{
    //Klasa Libri eshte klase Abstrakte
    private int isbn; 
    private String titulli;
    protected Autori[] autoret;
    protected int index = 0;
    //Konstruktori kryesore
    public Libri(int i, String t, int nrA){
        if(nrA < 1){
            System.out.println("Libri duhet te kete minimum nje autor!");
            System.exit(0);
        }
        isbn = i;
        titulli = t;
        autoret = new Autori[nrA];
    }
    //Metodat Get dhe Set
    public int getIsbn(){return isbn;}
    public String getTitulli(){return titulli;}
    public Autori[] getAutoret(){return autoret;}
    public void setTitulli(String t){titulli = t;}
    public abstract void shtoAutorin(Autori a);
    // OverRide per paraqitjen e te dhenave tek Klasa Libri
    @Override
    public String toString(){
        String libriToString = isbn + " : " + titulli + " - [";
        for(int i = 0; i < index; i++){
            libriToString += autoret[i].toString();
            if(i < index - 1)
                libriToString += ", ";
            else
                libriToString += "]";
        }
        return libriToString;
    }
    public boolean equals(Object o){
        if(o instanceof Libri){
            return isbn == ((Libri)o).getIsbn();
        }
        return false;
    }
}