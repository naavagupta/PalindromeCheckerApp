import java.util.*;

public class UC6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String processed = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < processed.length(); i++) {
            char ch = processed.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");

        sc.close();
    }
}