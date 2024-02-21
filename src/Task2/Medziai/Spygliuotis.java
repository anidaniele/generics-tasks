package Task2.Medziai;

import Task2.Interfaces.Medis;

public class Spygliuotis implements Medis {
    @Override
    public void turi() {
        System.out.println(this.toString() + " turi spyglius");
    }
}
