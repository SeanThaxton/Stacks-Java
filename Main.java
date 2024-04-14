import java.util.Stack;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       String[][] pairs = {{"a", "b"}, {"a", "c"}, {"b", "c"}};
        pairEqualCheck(pairs);
    }

    public static boolean pairEqualCheck(String[][] pairs){
        Stack theStack = new Stack<>();
        
        //Allow for the accumulation of the pairs of 
        for(int x = 0; x < pairs.length; x++){
            for(int y = 0; y < pairs[x].length; y++){
            
                System.out.println(pairs[x][y]);
        }
    }
        
        // Build in method to determine if the stack is empty or not.
        return theStack.empty();
    }
}