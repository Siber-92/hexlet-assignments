package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.length() == 0) {
            return new HashMap<>();
        }
        Map<String, Integer> wordCount = new HashMap<>();

        final int count = 1;

        for (String word : sentence.split(" ")) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + count);
            } else {
                wordCount.put(word, count);
            }
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder result = new StringBuilder("{\n");

        for (Map.Entry<String, Integer> word : map.entrySet()) {
            result.append("  ").append(word.getKey()).append(": ").append(word.getValue()).append("\n");
        }
        return result + "}";
    }
}
//END
