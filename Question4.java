// Question 4:Write a Java Program to find the duplicate characters in a string.

import java.util.HashMap;
import java.util.Map;

public class Question4 {

    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store character count
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to character array
        char[] charArray = str.toCharArray();

        // Count occurrences of each character
        for (char c : charArray) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        String demoString = "Hello World";
        findDuplicateCharacters(demoString);
    }
}
