import java.util.*;
public class PalindromeCheckerApp {
    static void main() {
        static void main() {
            Scanner sc = new Scanner(System.in)
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String input = sc.nextLine();
            char[] arr = input.toCharArray();
            boolean isPalindrome = true;
            int left = 0;
            int right = arr.length - 1;
            String reversed = new StringBuilder(str).reverse().toString();
            if (str.equals(reversed)) {
                System.out.println(str + " is a palindrome.");
                while (left < right) {
                    if (arr[left] != arr[right]) {
                        isPalindrome = false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (isPalindrome) {
                    System.out.println(input + " is a palindrome.");
                } else {
                    System.out.println(str + " is not a palindrome.");
                    System.out.println(input + " is not a palindrome.");
                }
                sc.close();
            }


        }

}