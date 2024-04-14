import java.util.Stack;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       
        String test = "}{";
        String test2 = "[(])";
        pairEqualCheck(test);
        pairEqualCheck(test2);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static boolean pairEqualCheck(String pairs){
        Stack theStack = new Stack<>();
        
        //Allow for the accumulation of the pairs of 
        for(int x = 0; x < pairs.length(); x++){

                if(pairs.charAt(x) == '[' || pairs.charAt(x) == '{' ||  pairs.charAt(x) == '('  ){
                   
                    theStack.push(pairs.charAt(x));

                } else if(pairs.charAt(x) == ']' || pairs.charAt(x) == '}' || pairs.charAt(x) == ')') {
                    
                    theStack.pop();
                }
            
            
        }

        if (theStack.empty()) {
            System.out.println("Balanced.");
        }
        else {
            System.out.println("Not Balanced.");
        }
         // Build in method to determine if the stack is empty or not.P
         return theStack.empty();
    }
        
    
    
}