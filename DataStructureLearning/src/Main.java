import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Arguments for the methods
        List<double[]> doubles = new ArrayList<>() {{
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

        //Execution of the methods
        for (double[] doubleArray : doubles) {
            System.out.println(Introduction.maxValue(doubleArray));
        }

        for (String sentence : sentences) {
            System.out.println(Introduction.longestWord(sentence));
        }
    }
}
