import java.util.*;

public class DijkstraAlgorithm {
    
    public static void main(String[] args) {
        
        // Create two stacks: one for operators and one for values.
        Stack<String> operators = new Stack<String>();
        Stack<Double> values = new Stack<Double>();
        
        // Prompt the user to enter the expression as a string, with each token separated by a space.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String[] tokens = scanner.nextLine().split(" ");
        
        // Loop through each token in the input expression.
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            
            // If the token is a left parenthesis, do nothing and continue to the next token.
            if (token.equals("(")) {
                // do nothing
            }
            // If the token is an operator, push it onto the operators stack.
            else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("sqrt")) {
                operators.push(token);
            }
            // If the token is a right parenthesis, pop the top operator and two values from their respective stacks, evaluate the expression, and push the result onto the values stack.
            else if (token.equals(")")) {
                String operator = operators.pop();
                double value = values.pop();
                
                // Perform the appropriate operation based on the operator that was popped.
                if (operator.equals("+")) {
                    value = values.pop() + value;
                }
                else if (operator.equals("-")) {
                    value = values.pop() - value;
                }
                else if (operator.equals("*")) {
                    value = values.pop() * value;
                }
                else if (operator.equals("/")) {
                    value = values.pop() / value;
                }
                else if (operator.equals("sqrt")) {
                    value = Math.sqrt(value);
                }
                
                // Push the result onto the values stack.
                values.push(value);
            }
            // If the token is a number, convert it to a double and push it onto the values stack.
            else {
                double value = Double.parseDouble(token);
                values.push(value);
            }
        }
        
        // The result of the expression is the final value on the values stack.
        System.out.println(values.pop());
    }
}