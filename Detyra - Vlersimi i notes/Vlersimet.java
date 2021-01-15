import java.util.Scanner;
// Importimi i Scannerit qe na ndihmon te marrim te dhenat nga useri
class vlersimi {
    //Metoda Main
    public static void main(String[] args) {
        System.out.println("Programi per paraqitjen e notes");
        Scanner sc = new Scanner(System.in);
        System.out.println("Shkruaj numrin e pikeve te testit");
        // Krijimi i input-it
        int piket = sc.nextInt();
        int nota;
        //Kushtet per kalkulimin e notes
        if(piket >= 51 && piket <= 60){
            nota = 6;
            System.out.println("Ju keni marre noten " + nota);
        }
        else if(piket >= 61 && piket <= 70){
            nota = 7;
            System.out.println("Ju keni marre noten " + nota);
        }
        else if(piket >= 71 && piket <= 80){
            nota = 8;
            System.out.println("Ju keni marre noten " + nota);
        }
        else if(piket >= 81 && piket <= 90){
            nota = 9;
            System.out.println("Ju keni marre noten " + nota);
        }
        else if(piket >= 91 && piket <= 100){
            nota = 10;
            System.out.println("Ju keni marre noten " + nota);
        }
        //Mbyllja e Scannerit
        sc.close();


    }
}