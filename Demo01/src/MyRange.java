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
        StringBuilder result = new StringBuilder();
        int start = Integer.parseInt(String.valueOf(input.charAt(1)));
        int end = Integer.parseInt(String.valueOf(input.charAt(3)));
        if(start < end) {
            if(input.startsWith("(")) {
                if(input.endsWith(")")) {
                    for(int i = start+1; i < end ; i++) {
                        if(result.length() > 0) {
                            result.append(",");
                        }
                        result.append(i);
                    }
                }
                if(input.endsWith("]")) {
                    for(int i = start+1; i <= end ; i++) {
                        if(result.length() > 0) {
                            result.append(",");
                        }
                        result.append(i);
                    }
                }
            }
            else if(input.startsWith("[")) {
                if(input.endsWith(")")) {
                    for(int i = start; i < end ; i++) {
                        if(result.length() > 0) {
                            result.append(",");
                        }
                        result.append(i);
                    }
                }
                if(input.endsWith("]")) {
                    for(int i = start; i <= end ; i++) {
                        if(result.length() > 0) {
                            result.append(",");
                        }
                        result.append(i);
                    }
                }
            }
            System.out.println(result);
        } else {
            System.out.println("Error: Start Number > End Number");
        }
    }
}
