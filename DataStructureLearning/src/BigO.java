import java.util.ArrayList;
import java.util.List;

public class BigO {

    public static List<Object> fizzBuzz(int n) {
        List<Object> fizzbuzz = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                fizzbuzz.add("fizzbuzz");
            }
            else if (i % 3 == 0) {
                fizzbuzz.add("fizz");
            }
            else if (i % 5 == 0) {
                fizzbuzz.add("buzz");
            }
            else {
                fizzbuzz.add(i);
            }
        }
        return fizzbuzz;
    }

    public static List<List<String>> pairs(List<String> elements) {
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            for (int  j = i + 1; j < elements.size(); j++) {
                if (elements.get(i) != elements.get(j)) {
                    result.add(
                            new ArrayList<>(List.of(elements.get(i), elements.get(j)))
                    );
                }
            }
        }

        return result;
    }
}
