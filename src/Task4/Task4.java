package Task4;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        ListOfNumbers listObject1 = new ListOfNumbers();
        listObject1.addNumber(1.5d);
        listObject1.addNumber(10d);
        listObject1.addNumber(2.5d);

        ListOfNumbers listObject2 = new ListOfNumbers();
        listObject2.addNumber(0d);
        listObject2.addNumber(1d);

        ListOfNumbers listObject3 = new ListOfNumbers();
        listObject3.addNumber(100d);

        printArrayList(findWithMaxAverage(listObject1, listObject2, listObject3));
        printArrayList(findWithMaxAverage(listObject1, listObject2));

    }

    public static ListOfNumbers findWithMaxAverage(ListOfNumbers... doubleList) {
        Double currentMaxAverage = 0d;
        ListOfNumbers withmaxAverage = null;
        for (ListOfNumbers singleList : doubleList) {
            if (singleList.getAvergae() > currentMaxAverage) {
                currentMaxAverage = singleList.getAvergae();
                withmaxAverage = singleList;
            }
        }
        return withmaxAverage;
    }

    public static void printArrayList(ListOfNumbers doubleList) {
        ArrayList<Double> doubles = doubleList.getDoubleArrayList();
        if (doubles == null || doubles.isEmpty()) {
            System.out.println("ArrayList is empty.");
            return;
        }

        StringBuilder builder = new StringBuilder("ListOfNumbers{numbers=[");
        for (Double value : doubles) {
            builder.append(value).append(", ");
        }
        builder.setLength(builder.length() - 2);

        System.out.println(builder+"]}");
    }

}