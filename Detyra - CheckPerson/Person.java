public class Person {
    // Klasa Personi me 3 atribute private
    private String Emri;
    private String Mbiemri;    
    private String Puna;
    // Konstruktori me 2 atribute te caktuara
    public Person(String Emri,String Mbiemri)
    {
       this.Emri = Emri;
       this.Mbiemri = Mbiemri;
       this.JobPosition = "I pa pune";
    } 
    // Konstruktori me 3 atribute te caktuara
    public Person(String Emri,String Mbiemri, String Puna)
    {
       this.Emri = Emri;
       this.Mbiemri = Mbiemri;
       this.Puna = Puna;
    } 
    // Metodat Get edhe Set
    public String getEmri(){
        return this.Emri;
    }
    public void setEmri(String newEmri){
        this.Emri = newEmri;
    }
    public String getMbiemri(){
        return this.Mbiemri;
    }
    public void setMbiemri(String newMbiemri){
        this.Mbiemri = newMbiemri;
    }
    public String getJPuna(){
        return this.JobPPunaosition;
    }
    public void setPuna(String newPuna){
        this.Puna = newPuna;
    }
    // Override i klases personi
    @Override
    public String toString() {
        return this.Emri + " " + this.Mbiemri + " punon si -> " + this.Puna;
    }
}
    