import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class ListCompareTest {

    List<Integer> list1;
    List<Integer> list2;
    ListCompare listCompare;

    @BeforeEach
    void beforeTest() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        listCompare = new ListCompare();
    }

    @Test
    void testFindListAverage() {
        list1.addAll(Arrays.asList(1,2,3));
        list2.addAll(Arrays.asList(1,2,3,4));

        assertThat(listCompare.findListAverage(list1)).isEqualTo(2.0);
        assertThat(listCompare.findListAverage(list2)).isEqualTo(2.5);
    }

    @Test
    void testCompareListAverage() {
        assertThat(listCompare.compareListAverage(5.5, 5.0)).isEqualTo(1);
        assertThat(listCompare.compareListAverage(5.0, 5.5)).isEqualTo(2);
        assertThat(listCompare.compareListAverage(5.25, 5.25)).isEqualTo(0);
    }
}
