import java.util.List;

public class Introduction {
    static double maxValue(double[] numbers) {
        double maxDouble = Double.NEGATIVE_INFINITY;

        for (double num : numbers) {
            if (num > maxDouble) {
                maxDouble = num;
            }
        }

        return maxDouble;
    }

    static String longestWord(String sentence) {
        String longest = "";
        String[] splitSentence = sentence.split(" ");

        for (String word : splitSentence) {
            if (word.length() >= longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    static boolean allEven(Integer[] nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
