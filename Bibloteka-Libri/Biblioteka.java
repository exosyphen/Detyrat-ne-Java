public class Biblioteka {
// Klasa Bibloteka si dhe MainMetoda
    public static void main(String[] args) {
        //Inicializimi i te dhenave per secilen te dhene qe merret nga klasa Libri
        Libri libra1 = new Libri(1,"Libri 1 ",2000);
        Libri libra2 = new Libri(2,"Libri 2 ",2002);
        Libri libra3 = new Libri(3,"Libri 3 ",2006);
        Libri libra4 = new Libri(4,"Libri 4 ",2008);
        // Paraqitja si string
        String libri1 =libra1.toString();
        String libri2 =libra2.toString();
        String libri3 =libra3.toString();
        String libri4 =libra4.toString();
        //Printimi i te dhenave ne terminal
        System.out.println(libri1);
        System.out.println(libri2);
        System.out.println(libri3);
        System.out.println(libri4);
        


    }
    
}
