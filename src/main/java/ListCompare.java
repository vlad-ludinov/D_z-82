import java.util.List;

public class ListCompare {

    public double findListAverage(List<Integer> list) {
        double tempd = 0;
        for (Integer number: list) {
            tempd+= number;
        }
        return tempd/(double)list.size();
    }

    public int compareListAverage(Double num1, Double num2) {
        if (num1 > num2) {
            System.out.println("Первый список имеет большее среднее значение");
            return 1;
        } else if (num2 > num1) {
            System.out.println("Второй список имеет большее среднее значение");
            return 2;
        } else {
            System.out.println("Средние значения равны");
            return 0;
        }
    }
}
