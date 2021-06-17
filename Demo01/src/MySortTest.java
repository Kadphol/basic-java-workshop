import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    public void EmptySort() {
        MySort mysort = new MySort(new ArrayList<>());
        List<Integer> result = mysort.sort();
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void OneElementList() {
        MySort mysort = new MySort(Arrays.asList(1));
        List<Integer> result = mysort.sort();
        assertEquals(Arrays.asList(1), result);
    }

    @Test
    public void TwoElementListCase01() {
        MySort mysort = new MySort(Arrays.asList(1,2));
        List<Integer> result = mysort.sort();
        assertEquals(Arrays.asList(1,2),result);
    }
}