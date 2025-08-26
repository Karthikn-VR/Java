package strings;

import java.util.ArrayList;
import java.util.List;

public class NaivePatternSearch {

    public static List<Integer> search(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            String sub = text.substring(i, i + m);
            if (sub.equals(pattern)) {
                result.add(i);
            }
        }
        return result;
    }

  
    public static void main(String[] args) {
        String text = "abcdxabchjikabc";
        String pattern = "abc";

        List<Integer> matches = search(text, pattern);

        if (matches.isEmpty()) {
            System.out.println("No match found.");
        } else {
            for (int index : matches) {
                System.out.println("Pattern found at index: " + index);
            }
        }
    }
}
