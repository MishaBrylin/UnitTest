package HW06;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListAverageComparatorTest {

    @Test
    void averageСomparison() {
        ListAverageComparator listAV = new ListAverageComparator(Arrays.asList(999, 1223, 3123, 4234, 2353, 213, 22), Arrays.asList(1, 3, 4));
        assertEquals("Первый список имеет большее среднее значение", ListAverageComparator.averageСomparison(listAV));
        ListAverageComparator listAV2 = new ListAverageComparator(Arrays.asList(3, 1), Arrays.asList(9, 9, 4));
        assertEquals("Второй список имеет большее среднее значение", ListAverageComparator.averageСomparison(listAV2));
        ListAverageComparator listAV3 = new ListAverageComparator(Arrays.asList(9, 9), Arrays.asList(9, 9));
        assertEquals("Средние значения равны", ListAverageComparator.averageСomparison(listAV3));
    }
}