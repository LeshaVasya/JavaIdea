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
    public static final Pattern mathCharacterSet = Pattern.compile("[-+*/()\\d\\s]+");

    public static void main(String args[]){

    }

    public static boolean checkParentesisPair(String expression) {
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
                throw new UnsupportedOperationException(String.format("Unsupported math operation: %c", operation));
            }
        }
    }

    /**
    * Check if expression consists of only: digits, dots, spaces, parenthesis, math operands  +-/*
    */
    public static boolean initialValidate(String expression, Pattern validCharacterset) {
        Matcher theMatcher = mathCharacterSet.matcher(expression);
        return theMatcher.matches();
    }

    public static String cutSpaces(String expression){
        expression.trim();
        return expression.replaceAll("[\\s]+", "");
    }
}
