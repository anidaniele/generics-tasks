package Task3;

import java.util.ArrayList;

public class Mapas {

    private ArrayList<Pora> sarasasPoru = new ArrayList<>();

    public <T> void ideti(T raktas, T reiksme) {
        this.sarasasPoru.add(new Pora<>(raktas, reiksme));
    }

    public <T> T gauti(T raktas){
        for (Pora pora : this.sarasasPoru) {
            if (pora.equals(raktas)){
                return (T) pora.getReiksme();
            }
        }
        return null;
    }

}
