import java.util.ArrayList;
import java.util.Iterator;
//Improtimi i Arraylistes dhe Iteratorit
public class Detyra1Iterator {

    public static void main(String[] args) {
        ArrayList  items =  new ArrayList();
        // Krijimi i ArrayList dhe vendosja e elementeve ne te
        items.add("produkti A ");
        items.add("produkti B ");
        items.add("produkti C ");
        items.add("produkti D ");
        items.add("produkti E ");
        Iterator it = items.iterator();
        // While loop
        while (it.hasNext()){
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}
