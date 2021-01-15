public class User {
    // Klasa Useri me 4 atribute private
    private int id;
    private String email;
    private String password;
    private  boolean isActive;
    // Konstruktori i klases Useri
    public User(int id,String email, String password, boolean isActive){
        this.id = id;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
    }
    // Metodat Get dhe Set
    public int getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public boolean getIsActive(){
        return isActive;
    }
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }
    // Override i klases Useri
    @Override
    public String toString(){
        return "ID :"+id+" Email :"+email+" Password : "+password+" Is Active : "+isActive;
    }


}
