import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author avasiliev
 * @project MathExpressionCalculator
 * @since 2016-07-10
 */
public class InteractRunner {
    public static  final double EPSILON = 0.000001;

    public static void main(String args[]){

    }

    private static Double makeMathOperation(String mathOperation, Double operand1, Double operand2) {
        if (mathOperation.equals("*")) {
            return operand1 * operand2;
        }
        else if (mathOperation.equals("/")) {
            return operand1 / operand2;
        }
        else if (mathOperation.equals("+")) {
            return operand1 + operand2;
        }
        else if (mathOperation.equals("-")) {
            return operand1 - operand2;
        }
        else {
            System.out.printf("Provided operation is not math: %s", mathOperation);
            return null;
        }
    }

    public static boolean checkRoundParentesisPair(String expression) {
        if (expression.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++)
        {
            char currentCharacter = expression.charAt(i);

            if (currentCharacter == '(')
            {
                stack.push(currentCharacter);
            }

            if (currentCharacter == ')')
            {
                if (stack.isEmpty()) {
                    return false;
                }

                char lastStackCharacter = stack.peek();
                if (lastStackCharacter == '(')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private int countOperationPriority(char token) {
        switch (token) {
            case '+': return 1;
            case '-': return 1;
            case '*': return 2;
            case '/': return 2;
            default : return 0;
        }
    }

    public static double applyMathOperation(char operation, double operand1, double operand2)
    {
        switch (operation) {
            case '+': {
                return operand1 + operand2;
            }
            case '-': {
                return operand1 - operand2;
            }
            case '*': {
                return operand1 * operand2;
            }
            case '/': {
                if ((operand2 > EPSILON) || (operand2 < -EPSILON)) {
                    return operand1 / operand2;
                } else {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
            }
            //TODO: Handle this exception
            default: {
                throw new UnsupportedOperationException(String.format("Unsupported math operation %c", operation));
            }
        }
    }


    public static boolean validate(String expression) {
        Pattern validCharacterSet = Pattern.compile("(?<=op)|(?=op)".replace("op", "[-+*/()]"));
        Matcher matcher = validCharacterSet.matcher(expression);
        return matcher.matches();
    }
}
