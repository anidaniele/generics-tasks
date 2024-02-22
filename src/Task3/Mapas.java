package Task3;

import java.util.ArrayList;

public class Mapas<K, V> {

    private ArrayList<Pora<K,V>> sarasasPoru = new ArrayList<>();

    public void ideti(K raktas, V reiksme) {
        this.sarasasPoru.add(new Pora<>(raktas, reiksme));
    }

    public V gauti(K raktas){
        for (Pora<K,V> pora : this.sarasasPoru) {
            if (pora.getRaktas().equals(raktas)){
                return pora.getReiksme();
            }
        }
        return null;
    }

}
