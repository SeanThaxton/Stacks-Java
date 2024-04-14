import java.util.Stack;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       String[][] test = {{"[()]{}{[()()]()}", "b"}, {"a", "c"}, {"b", "c"}};
        pairEqualCheck(test);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static boolean pairEqualCheck(String pairs){
        Stack theStack = new Stack<>();
        
        //Allow for the accumulation of the pairs of 
        for(int x = 0; x < pairs.length; x++){

                if(pairs[x] == "[" || pairs[x] == "{" ||  pairs[x] == "("  ){
                    theStack.push(pairs[x]);

                } else if(pairs[x] == "]" || pairs[x] == "}" || pairs[x] == ")") {
                    
                    theStack.pop();
                }
            
            
        }
                // Build in method to determine if the stack is empty or not.P
                return theStack.empty();
    }
        
    
    
}