public class Libri{
    //Klasa Libri ka 3 vlera private
    private int isbn;
    private String titulli;
    private int vitiPublikimit;
    //Konstruktori i klases Libri dhe Parametrat e saj
    public Libri(int isb, String titull, int vPublikimit){
        isbn = isb;
        titulli = titull;
        vitiPublikimit = vPublikimit;
    }
    //Metodat Get dhe Set 
    public int getIsbn(){
        return isbn;
    }
    public String getTitulli(){
        return titulli;
    }
    public int getvitiPublikimit(){
        return vitiPublikimit;
    }
    public void setTitulli(String titull){
        titulli = titull;
    }
    public void setVitiPublikimit(int vPublikimit){
        vitiPublikimit = vPublikimit;
    }
    //Override i klases
    @Override
    public String toString(){
        return isbn+": "+titulli+"- "+vitiPublikimit;
    }
}