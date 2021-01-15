public class Autori{
//Klasa Autori permban te dhenat e autoreve qe do te paraqiten pastaj ne klasen Bibloteka
    private int id;
    private String emri;
    private String mbiemri;
    //Konstruktori i klases autori
    public Autori(int ids, String emrat, String mbiemrat){
        id  = ids;  
        emri = emrat;
        mbiemri = mbiemrat;
        // Id eshte ReadOnly ndersa Emri dhe Mbiemri nuk jane
    }
    // Metodat Get dhe Set
    public int getId(){ return id; }
    public String getEmri(){ return emri; }
    public String getMbiemri(){ return mbiemri; }
    public void setEmri(String e){ emri = e; }
    public void setMbiemri(String m){ mbiemri = m; }
    public boolean equals(Object o){
        if(o instanceof Autori){
            return id == ((Autori)o).getId();
        }
        return false;
    }
    //Paraqitja e te dhenave te autorve
    public String toString(){
        return "Numri" + id + " -> " + emri +  " - " + mbiemri;
    }

}