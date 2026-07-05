import java.util.Stack;

public class infix {
     static int applyOperation(int a, int b, String op) {
        if (op.equals("+")) return a + b;
        if (op.equals("-")) return a - b;
        if (op.equals("*")) return a * b;
        
        // Floor Division
        if (op.equals("/")) {
            if (a * b < 0 && a % b != 0)
                return a / b - 1;
            return a / b;
        }
        
        if (op.equals("^")) return (int) Math.pow(a, b);
        return 0;
    }

    // Function to return precedence of operators
    static int precedence(String op) {
        if (op.equals("+") || op.equals("-")) return 1;
        if (op.equals("*") || op.equals("/")) return 2;
        if (op.equals("^")) return 3;
        return 0;
    }

    // Function to check if operator is right-associative
    static boolean isRightAssociative(String op) {
        return op.equals("^");
    }

    // Function to check if token is a number
    static boolean isNumber(String token) {
        if (token == null || token.isEmpty()) return false;
        int start = (token.charAt(0) == '-') ? 1 : 0;
        if (start == 1 && token.length() == 1) return false;
        for (int i = start; i < token.length(); i++) {
            if (!Character.isDigit(token.charAt(i))) return false;
        }
        return true;
    }

    // Function to evaluate infix expression
    static int evaluateInfix(String[] arr) {
        Stack<Integer> values = new Stack<>();
        Stack<String> ops = new Stack<>();

        for (String token : arr) {

            // If it's a number, push to values stack
            if (isNumber(token)) {
                values.push(Integer.parseInt(token));
            } 

            // If it's an operator
            else {
                while (!ops.isEmpty() &&
                        ((precedence(ops.peek()) > precedence(token)) ||
                        (precedence(ops.peek()) == precedence(token) &&
                                            !isRightAssociative(token)))) {

                    int val2 = values.pop();
                    int val1 = values.pop();
                    String op = ops.pop();
                    values.push(applyOperation(val1, val2, op));
                }
                ops.push(token);
            }
        }

        // Process remaining operators
        while (!ops.isEmpty()) {
            int val2 = values.pop();
            int val1 = values.pop();
            String op = ops.pop();
            values.push(applyOperation(val1, val2, op));
        }

        return values.pop();
    }

    public static void main(String[] args) {
        String[] arr = {"100", "+", "200", "/", "2", "*", "5", "+", "7"};
        
        System.out.println(evaluateInfix(arr));
    }

}
