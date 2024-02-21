package Task2.Medziai;

import Task2.Interfaces.Medis;

public class Lapuotis implements Medis {
    @Override
    public void turi() {
        System.out.println(this.toString() + " turi lapus");
    }
}
