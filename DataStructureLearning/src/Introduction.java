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
}
