import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    @DisplayName("Test Sort with Empty List")
    public void EmptySort() {
        MySort mysort = new MySort(new ArrayList<>());
        List<Integer> result = mysort.sort();
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    @DisplayName("Test Sort with Single items in List")
    public void OneElementList() {
        MySort mysort = new MySort(Collections.singletonList(1));
        List<Integer> result = mysort.sort();
        assertEquals(Collections.singletonList(1), result);
    }

    @Test
    @DisplayName("Test Sort with Two items in List => [1,2]" + "expected result [1,2]")
    public void TwoElementListCase01() {
        MySort mysort = new MySort(Arrays.asList(1,2));
        List<Integer> result = mysort.sort();
        assertEquals(Arrays.asList(1,2),result);
    }

    @Test
    @DisplayName("Test Sort with Two items in List => [2,1]" + "expected result [1,2]")
    public void TwoElementListCase02() {
        MySort mysort = new MySort(Arrays.asList(2,1));
        List<Integer> result = mysort.sort();
        assertEquals(Arrays.asList(1,2),result);
    }

    @Test
    @DisplayName("Test Sort with Three items in List => [1,2,3]" + "expected result [1,2,3]")
    public void ThreeElementListCase01() {
        MySort mysort = new MySort(Arrays.asList(1,2,3));
        List<Integer> result = mysort.sort();
        assertEquals(Arrays.asList(1,2,3),result);
    }
}