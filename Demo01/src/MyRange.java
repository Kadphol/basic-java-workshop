import java.util.ArrayList;
import java.util.List;

public class MyRange {
    private final String input;
    public MyRange(String input) {
        this.input = input;
    }

    public boolean checkStartWithInclude() {
        return input.startsWith("[");
    }

    public boolean checkEndWithInclude() {
        return input.endsWith("]");
    }

    public boolean checkStart() {
        return input.startsWith("[") || input.startsWith("(");
    }

    public boolean checkEnd() {
        return input.endsWith("]") || input.startsWith(")");
    }

    public boolean checkNumber() {
        int firstNum = getFirstNumber();
        int secondNum = getSecondNumber();
        return secondNum >= firstNum;
    }

    public boolean checkFormat() {
        return input.charAt(2) == ',';
    }

    public boolean checkAll() {
        return checkStart() && checkEnd() && checkNumber() && checkFormat();
    }

    public int getFirstNumber() {
        final int firstNum = Character.getNumericValue(input.charAt(1));
        if(checkStartWithInclude()) return firstNum;
        return firstNum+1;
    }

    public int getSecondNumber() {
        final int secondNum = Character.getNumericValue(input.charAt(3));
        if(checkEndWithInclude()) return secondNum;
        return secondNum-1;
    }

    public String getResult() {
        int firstNum = getFirstNumber();
        int SecondNum = getSecondNumber();
        List<String> results = new ArrayList<>();
        for(int i = firstNum; i <= SecondNum; i++) {
            results.add(String.valueOf(i));
        }
        return String.join(",",results);
    }

    public static void main(String[] args) {
        String input = args[0];
        MyRange myRange = new MyRange(input);
        if(myRange.checkAll()) {
            System.out.println(myRange.getResult());
        }

    }
}
