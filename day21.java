import java.util.*;
public class Day_21 {

        // Function to insert element at the bottom of stack
        public static void insertAtBottom(Stack<Integer> stack, int x) {
            if (stack.isEmpty()) {
                stack.push(x);
                return;
            }
            int top = stack.pop();
            insertAtBottom(stack, x);
            stack.push(top);
        }

        // Function to reverse the stack
        public static void reverse(Stack<Integer> stack) {
            if (stack.isEmpty()) return;

            int top = stack.pop();
            reverse(stack);
            insertAtBottom(stack, top);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input stack size
            System.out.print("Enter stack size: ");
            int n = sc.nextInt();

            Stack<Integer> stack = new Stack<>();
            System.out.println("Enter stack elements: ");
            for (int i = 0; i < n; i++) {
                stack.push(sc.nextInt());
            }

            System.out.println("Original Stack: " + stack);
            reverse(stack);
            System.out.println("Reversed Stack: " + stack);

           
        }
}
