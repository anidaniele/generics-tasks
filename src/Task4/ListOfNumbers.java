package Task4;

import java.util.ArrayList;

public class ListOfNumbers {
    private ArrayList<Double> doubleArrayList;

    public ArrayList<Double> getDoubleArrayList() {
        return doubleArrayList;
    }

    public void addNumber(Double value) {
        if (doubleArrayList == null) {
            doubleArrayList = new ArrayList<>();
        }
        doubleArrayList.add(value);
    }

    public Double getAvergae() {
        Double sum = 0d;
        for (Double number : this.doubleArrayList) {
            sum += number;

        }
        return sum / doubleArrayList.size();
    }


    public double calculateAverage() {
        if (doubleArrayList == null || doubleArrayList.isEmpty()) {
            throw new IllegalStateException("ArrayList is null or empty");
        }

        double sum = 0;
        for (Double num : doubleArrayList) {
            sum += num;
        }

        return sum / doubleArrayList.size();
    }

}
