import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        String name = "Hello";

        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        int[] scores = new int[]{20, 30, 40 ,50 ,22};
//        scores[0] = 20;
//        scores[1] = 30;
//        scores[2] = 40;
//        scores[3] = 50;
//        scores[4] = 22;
        for(int score: scores) {
            System.out.println(score);
        }
        for(int i = 0; i < scores.length; i++) {
            System.out.println(i + " : " + scores[i]);
        }
        Arrays.stream(scores).forEach(score -> System.out.println(score));
    }
}
