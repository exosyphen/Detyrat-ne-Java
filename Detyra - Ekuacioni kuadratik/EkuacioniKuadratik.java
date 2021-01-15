import java.util.Scanner;
public class Detyra3 {
    //Kalkulimi i ekuacioni kuadratik
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruaj vleren e A :");
        double a = sc.nextDouble();
        //Vlera e A nga useri
        System.out.print("Shkruaj vleren e B :");
        double b = sc.nextDouble();
        //Vlera e B nga useri
        System.out.print("Shkruaj vleren e C :");
        double c = sc.nextDouble();
        //Vlera e C nga useri
        double domain = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(domain);
        //Kalkulimi i zgjedhjes
        if(domain>0){
            double zgjdhja1 = (-b + sqrt)/(2*a);
            double zgjidhja2 = (-b - sqrt)/(2*a);
            // Pasi qe ekuacioni kuadratik ka 2 zgjedhje athere krijohen 2 rezultate
            System.out.println("X1:"+ zgjdhja1);
            System.out.println("X2:"+ zgjidhja2);

        }else if (domain == 0){
            double zgj = (-b + sqrt)/(2*a);
            System.out.println("X1:"+ zgj);
        }else {
            // Ne rast se numrat qe kemi jepur gjenerojne rezultat te numrave ne bashkesine joreale athere na printohet kjo line
            System.out.println("Keto vlera krijojne ekuacion kuadratik me rezultat ne bashksin e numrave joreal");
        }
        sc.close();




    }
}
