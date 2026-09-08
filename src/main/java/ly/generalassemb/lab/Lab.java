package ly.generalassemb.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lab {

    public static void main(String[] args) {
    }

    // Part A

    public static int maxOfTwoNumbers(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int maxOfThree(int a, int b, int c) {
        return maxOfTwoNumbers(maxOfTwoNumbers(a, b), c);
    }

    public static boolean isCharacterAVowel(String ch) {
        String lower = ch.toLowerCase();
        return lower.equals("a") || lower.equals("e") || lower.equals("i")
                || lower.equals("o") || lower.equals("u");
    }

    public static int countArguments(Object... args) {
        return args.length;
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static int findLongestWord(String[] words) {
        if (words == null || words.length == 0) {
            return 0;
        }
        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }
        return maxLength;
    }

    public static String[] filterLongWords(String[] words, int threshold) {
        return Arrays.stream(words)
                .filter(w -> w.length() > threshold)
                .toArray(String[]::new);
    }

    // Part C

    public static ArrayList<Integer> filterEvenNumbers(List<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) {
                result.add(n);
            }
        }
        return result;
    }

    public static Set<String> removeDuplicates(List<String> words) {
        return new LinkedHashSet<>(words);
    }

    public static Map<String, Integer> countWordFrequency(String[] words) {
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            String lower = word.toLowerCase();
            frequency.put(lower, frequency.getOrDefault(lower, 0) + 1);
        }
        return frequency;
    }

    public static String analyzeCollectionPerformance() {
        int n = 100_000;
        StringBuilder report = new StringBuilder();

        List<Integer> arrayList = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) arrayList.add(i);
        long arrayListMs = (System.nanoTime() - start) / 1_000_000;

        List<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) linkedList.add(i);
        long linkedListMs = (System.nanoTime() - start) / 1_000_000;

        report.append("ArrayList append ").append(n).append(": ").append(arrayListMs).append("ms\n");
        report.append("LinkedList append ").append(n).append(": ").append(linkedListMs).append("ms\n\n");
        report.append("ArrayList: array-backed, O(1) random access by index, best default choice.\n");
        report.append("LinkedList: node-backed, better for frequent insert/remove at front/middle, O(n) random access.\n\n");
        report.append("HashSet: O(1) avg add/contains, no order guarantee.\n");
        report.append("LinkedHashSet: O(1) avg, preserves insertion order.\n");
        report.append("TreeSet: O(log n), keeps elements sorted.\n\n");
        report.append("HashMap: O(1) avg get/put, no order guarantee.\n");
        report.append("LinkedHashMap: O(1) avg, preserves insertion order.\n");
        report.append("TreeMap: O(log n) get/put, keys always sorted.\n");

        return report.toString();
    }

    // Part D

    public static <T extends Comparable<T>> MinMaxResult<T> findMinMax(List<T> items) {
        T min = items.get(0);
        T max = items.get(0);
        for (T item : items) {
            if (item.compareTo(min) < 0) min = item;
            if (item.compareTo(max) > 0) max = item;
        }
        return new MinMaxResult<>(min, max);
    }

    public static List<String> processDataWithCallback(
            List<Integer> data,
            Predicate<Integer> filter,
            Function<Integer, String> transformer) {

        List<String> result = new ArrayList<>();
        for (int value : data) {
            if (filter.test(value)) {
                result.add(transformer.apply(value));
            }
        }
        return result;
    }

    public static Map<String, Map<Character, List<String>>> groupDataByCategory(List<Student> students) {
        Map<String, Map<Character, List<String>>> result = new HashMap<>();

        for (Student s : students) {
            result
                    .computeIfAbsent(s.getSubject(), subj -> new HashMap<>())
                    .computeIfAbsent(s.getGrade(), grade -> new ArrayList<>())
                    .add(s.getName());
        }

        return result;
    }
}