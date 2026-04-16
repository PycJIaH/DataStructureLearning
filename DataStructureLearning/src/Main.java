import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<double[]> numbers = new ArrayList<>() {{
            add(new double[] { 2, 5, 1, 1, 4 });
            add(new double[] { 1000, 8, 9000 });
            add(new double[] { 1000, 8 });
            add(new double[] { -5, -2, -1, -11 });
            add(new double[] { 10, 5, 40, 40.3 });
            add(new double[] { 4, 7, 2, 8, 10, 9 });
        }};

        List<String> sentences = new ArrayList<>() {{
            add("what a wonderful world");
            add("have a nice day");
            add("the quick brown fox jumped over the lazy dog");
            add("who did eat the ham");
            add("potato");
        }};

        for (double[] doubleArray : numbers) {
            double maxNumber = 0;
            for (double number : doubleArray) {
                maxNumber = Introduction.maxValue(doubleArray);
            }
            System.out.println(maxNumber);
        }

        for (String sentence : sentences) {
            System.out.println(Introduction.longestWord(sentence));
        }
    }
}
