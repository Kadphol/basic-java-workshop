import java.util.ArrayList;
import java.util.List;

public class MySort {
    private final List<Integer> input;
    public MySort(List<Integer> input) {
        this.input = input;
    }

    public List<Integer> sort() {
        List<Integer> result = new ArrayList<>();

        if(input.size() <= 1) {
            return input;
        }

        int last = Integer.MIN_VALUE;
        for (int i = 0; i < input.size(); i++) {
            int min = Integer.MAX_VALUE;
            for (Integer num : input) {
                if(num < min && num > last) {
                    min = num;
                }
            }
            result.add(min);
            last = min;
        }

        return result;
    }
}
