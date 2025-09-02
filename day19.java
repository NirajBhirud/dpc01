import java.util.*;

public class PostfixEvaluator {
    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expr.split(" ");

        for (String token : tokens) {
            // If token is an operator
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b); // Integer division
                        break;
                }
            } else {
                // Token is an integer
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix expression (operands/operators separated by space):");
        String input = sc.nextLine();
        
        int result = evaluatePostfix(input);
        System.out.println("Result: " + result);
        
        sc.close();
    }
}
