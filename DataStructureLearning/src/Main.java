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

        List<Integer[]> ints = new ArrayList<>() {{
            add(new Integer[] { 4, 90, 68, 6, -2 });
            add(new Integer[] { 14, 40, 36, 3 });
            add(new Integer[] { 30, 24, 2048, 0, 12, 50 });
            add(new Integer[] { 7, 7, 7, 7 });
            add(new Integer[] { 100 });
            add(new Integer[] { 1, 2, 4, 6, 8 });
            add(new Integer[] { 42, 18, 96, 4, 70, 12, 58, 30, 84, 2 });
        }};

        Integer[] isPrimeValues = { 2, 3, 4, 6, 6, 7, 8, 25, 31, 2017, 2048, 1, 713 };

        Integer[] fizzbuzzs = { 11, 2, 16, 32 };

        List<List<String>> pairs = new ArrayList<>() {{
            add(new ArrayList<>(List.of("a", "b", "c")));
            add(new ArrayList<>(List.of("a", "b", "c", "d")));
            add(new ArrayList<>(List.of("cherry", "cranberry", "banana", "blueberry", "lime", "papaya")));
        }};

        //Execution of the methods
        for (double[] doubleArray : doubles) {
            System.out.println(Introduction.maxValue(doubleArray));
        }

        for (String sentence : sentences) {
            System.out.println(Introduction.longestWord(sentence));
        }

        for (Integer[] intsList : ints) {
            System.out.println(Introduction.allEven(intsList));
        }

        for (int isPrimeValue : isPrimeValues)  {
            System.out.println(Introduction.isPrime(isPrimeValue));
        }

        for (int fizzbuzz : fizzbuzzs)  {
            System.out.println(BigO.fizzBuzz(fizzbuzz));
        }

        for (List<String> pair : pairs) {
            System.out.println(BigO.pairs(pair));
        }
    }
}
