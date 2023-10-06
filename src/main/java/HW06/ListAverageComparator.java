package HW06;

import java.util.List;

public class ListAverageComparator {
    private List<Integer> list1;
    private List<Integer> list2;

    public ListAverageComparator(final List<Integer> list1, final List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    private static int getAverage(List<Integer> list) {
        int sum = 0;
        for (int i: list) {
            sum += i;
        }
        return sum / list.size();
    }

    public  static String averageСomparison(ListAverageComparator listAV) {
        int avarage1 = getAverage(listAV.list1);
        int avarage2 = getAverage(listAV.list2);
        if (avarage1 > avarage2) {
            return "Первый список имеет большее среднее значение";

        } else if (avarage1 < avarage2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }

    }
}
