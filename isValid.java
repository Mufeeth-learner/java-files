public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // If it's an opening bracket, push it to the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            // If it's a closing bracket
            else {
                // If stack is empty, there's no matching open bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.peek();
                
                // Check if the top of the stack matches the current closing bracket
                if ((ch == ')' && top == '(') || 
                    (ch == ']' && top == '[') || 
                    (ch == '}' && top == '{')) {
                    stack.pop(); // Valid match, remove from stack
                } else {
                    return false; // Mismatched brackets
                }
            }
        }
        
        // If the stack is empty, all brackets were properly matched
        return stack.isEmpty();
    }
}