import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        MySort mysort = new MySort(list);
        List<Integer> result = mysort.sort();
        assertEquals(list, result);
    }
}