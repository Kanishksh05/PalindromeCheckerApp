import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                char[] charArray = input.toCharArray();
                boolean isPalindrome = true;
                int start = 0;
                int end = charArray.length - 1;
                while (start < end) {
                    if (Character.toLowerCase(charArray[start]) != Character.toLowerCase(charArray[end])) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }
                if (isPalindrome) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
            }
        }
