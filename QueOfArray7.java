/*
 * Date : 07/05/2024
 * Name : Dhruv Patel
 * Aim : check the string is palindrome or not
 * Ex : Madam --> true
 *      Mad --> false
*/
import java.util.Scanner;
class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");        
        String word = sc.nextLine();
        boolean b = isPalindrome(word);
        System.out.println("The given string is palindrome : " + b);

    }

    // method for check string id palindrome or not
    public static boolean isPalindrome(String word) {
        // convert String word into char array
        char[] c = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (c[start] != c[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}