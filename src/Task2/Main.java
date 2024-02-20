package Task2;

import Task2.Interfaces.Medis;
import Task2.Medziai.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Azuolas azuolas = new Azuolas();
        Berzas berzas = new Berzas();
        Kadagys kadagys = new Kadagys();
        Egle egle = new Egle();

        ArrayList<Medis> medziai = new ArrayList<>();
        medziai.add(azuolas);
        medziai.add(berzas);
        medziai.add(kadagys);

        ArrayList<Spygliuotis> spygliuociai = new ArrayList<>();
        spygliuociai.add(kadagys);
        spygliuociai.add(egle);

        ArrayList<Berzas> berzai = new ArrayList<>();
        berzai.add(berzas);

        Miskas.ivairusMiskas(medziai);
        System.out.println();
        Miskas.spygliuociuMiskas(spygliuociai);
        System.out.println();
        Miskas.berzuMiskas(berzai);
    }



}
