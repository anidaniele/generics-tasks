package Task1;

public class Array {

    public static <T> void printArray(T[] genericArray) {
        System.out.println("Elements in provided data set");
        for (Object o : genericArray) {
            System.out.println(o);
        }
    }
}
