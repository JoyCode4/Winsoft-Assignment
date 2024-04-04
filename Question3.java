// Question 3: Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;
import java.util.Map;

public class Question3 {

    public static Map<String, Integer> countWords(String str) {
        // Split the string into words
        String[] words = str.split("\\s+");

        // Create a HashMap to store word count
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String demoString = "Java is a programming language Java is popular Java";
        Map<String, Integer> wordCountMap = countWords(demoString);

        // Print the word count
        System.out.println("Word count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
