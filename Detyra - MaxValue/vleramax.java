import java.util.Scanner;
// Importohet Scanneri per te marrur vlera nga useri
public class vleramax {
    public static void main(String[] args) {
        //Inicializimi i Scannerit
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheno Numrin e 1");
        int firstNum = sc.nextInt();
        //Vlera e numrit te pare nga useri
        System.out.println("Sheno Numrin e 2");
        int secondNum = sc.nextInt();
        //Vlera e numrit te dyte nga useri
        int vleraMax = firstNum > secondNum ? firstNum : secondNum;
        System.out.println("Numri maksimal eshte " + vleraMax);
        //Rezultati
        sc.close();
    }
}