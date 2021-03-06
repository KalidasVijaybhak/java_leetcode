//Valid Paranthesis LeetCode java

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='[' || c == '(' || c == '{'){
                stack.push(c);
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek()=='['){
            stack.pop();    
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek()=='('){
              stack.pop();  
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}


//To solve there are 3 scenarios
    // 1: []{}()
    // 2: {[()]}
    // 3: }{][       here count is same.


//Using stack is best