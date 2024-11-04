/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author alvaro
 */
public class Palindrome {

    public static void main(String[] args) {
        String[] words = {
            "level", // Palindrome
            "world", // Not a palindrome
            "radar", // Palindrome
            "java", // Not a palindrome
            "civic", // Palindrome
            "hello", // Not a palindrome
            "madam", // Palindrome
            "openai", // Not a palindrome
            "racecar", // Palindrome
            "example" // Not a palindrome
        };

        for (String word : words) {
            System.out.println(word + " is palindrome -> "
                    + isPalindrome(word.toLowerCase().toCharArray()));
        }
    }
    
    /**
     * 
     * @param charArr an array of characters to be checked
     * @return  {@code true} if the array is a palindrome, 
     *          {@code false} otherwise.
     */
    public static boolean isPalindrome(char[] charArr) {
        // Starts on left and compares to the letter on right, both going
        // to the center
        for (int i = 0; i <= charArr.length / 2; i++) {
            if (charArr[i] != charArr[(charArr.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }
}
