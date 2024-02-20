package Task2;

import Task2.Interfaces.Medis;
import Task2.Medziai.Berzas;
import Task2.Medziai.Lapuotis;
import Task2.Medziai.Spygliuotis;

import java.util.ArrayList;
import java.util.List;

public class Miskas {

    public static <T> void ivairusMiskas(ArrayList<T> sarasas){
        System.out.println("Ivairus miskas:");
        for (Object o : sarasas) {
            if (o instanceof Medis){
                ((Medis) o).turi();
            }
        }

    }
    public static <T extends Spygliuotis> void spygliuociuMiskas(ArrayList<T> sarasas){
        System.out.println("Spygliuociu miskas:");
        for (Object o : sarasas) {
            if (o instanceof Medis){
                ((Medis) o).turi();
            }
        }

    }
    public static <T extends Berzas> void berzuMiskas(ArrayList<T> sarasas){
        System.out.println("Berzu miskas:");
        for (Object o : sarasas) {
            if (o instanceof Medis){
                ((Medis) o).turi();
            }
        }
    }
}
