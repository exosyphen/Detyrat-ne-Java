public class MainClass {
// Klasa kryesore MainClass qe permban cli101 si pjese e Class2 e cila nuk eshte abstrakte
    public static void main(String[] args) {
        Class2 cli101 = new Class2("Klasa nuk eshte me abstrakte");
        System.out.println( cli101.isAbstract());

    }
}
