import java.util.Stack;

/**
 * Main
 */
public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Stack theStack = new Stack<>();

        String test = "}{";
        String test2 = "[(])";
        String test3 = "[()]{}{[()()]()}";

        pairEqualCheck(test, theStack);
        theStack.clear();

        pairEqualCheck(test2, theStack);
        theStack.clear();

        pairEqualCheck(test3, theStack);
        theStack.clear();
    }
    public static boolean pairEqualCheck(String pairs, Stack<Character> theStack) {
        for (int x = 0; x < pairs.length(); x++) {
            char currentChar = pairs.charAt(x);
            if (currentChar == '[' || currentChar == '{' || currentChar == '(') {
                theStack.push(currentChar);
            } else if (currentChar == ']' || currentChar == '}' || currentChar == ')') {
                if (theStack.empty()) {
                    System.out.println("UnBalanced");
                    return false; // Unbalanced: no corresponding opening parenthesis
                }
                char topChar = theStack.pop();
                if ((currentChar == ']' && topChar != '[') ||
                    (currentChar == '}' && topChar != '{') ||
                    (currentChar == ')' && topChar != '(')) {
                    System.out.println("UnBalanced");
                    return false; // Unbalanced: mismatched parentheses
                }
            }
        }
        if(theStack.empty()){
            System.out.println("Balanced");
        }

        return theStack.empty(); // Balanced if stack is empty after processing all characters
    }
    
    
}