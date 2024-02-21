package Task2;

import Task2.Interfaces.Medis;
import Task2.Medziai.Berzas;
import Task2.Medziai.Spygliuotis;

import java.util.ArrayList;

public class Miskas {

    public static void ivairusMiskas(ArrayList<? extends Medis> sarasas){
        System.out.println("Ivairus miskas:");
        for (Medis m : sarasas) {
            if (m instanceof Medis medis){
                medis.turi();
            }
        }
    }

    public static void spygliuociuMiskas(ArrayList<? extends Spygliuotis> sarasas){
        System.out.println("Spygliuociu miskas:");
        for (Spygliuotis s : sarasas) {
            if (s instanceof Medis medis){
                medis.turi();
            }
        }
    }

    public static void berzuMiskas(ArrayList<? extends Berzas> sarasas){
        System.out.println("Berzu miskas:");
        for (Berzas b : sarasas) {
            if (b instanceof Medis medis){
                medis.turi();
            }
        }
    }

}
