public class MyRange {
    private final String input;
    public MyRange(String input) {
        this.input = input;
    }

    public boolean checkStartWithInclude() {
        return input.startsWith("[");
    }

    public int getFirstNumber() {
        final int firstNum = Character.getNumericValue(input.charAt(1));
        if(checkStartWithInclude()) return firstNum;
        return firstNum +1;
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
