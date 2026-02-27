import java.util.Scanner;
public class PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    }
}