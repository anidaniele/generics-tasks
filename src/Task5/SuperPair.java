package Task5;

public class SuperPair <E, T, N extends Number> {
    E element;
    T type;
    N number;

    public SuperPair(E element, T type, N number) {
        this.element = element;
        this.type = type;
        this.number = number;
    }
}
