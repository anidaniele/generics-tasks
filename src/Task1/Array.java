package Task1;

public class Array {

    public static <T> void printArray(T[]... genericArray){
        System.out.println("Elements in provided data set");
        for (Object[] array : genericArray) {
            for (Object o : array) {
                System.out.println(o);
            }
        }
    }
}
