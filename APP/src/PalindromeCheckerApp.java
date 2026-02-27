import java.util.*;
public class PalindromeCheckerApp {
    static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string: ");
            String input = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();
            for (char c : input.toCharArray()) {
                stack.push(c);
                queue.add(c);
            }
            boolean isPalindrome = true;
            while (!stack.isEmpty()) {
                if (!stack.pop().equals(queue.remove())) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("It's a palindrome!");
            } else {
                System.out.println("Not a palindrome.");
            }
        }
    };
