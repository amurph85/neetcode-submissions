class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c =='['){
                stack.push(c);
            }
            else{
                if (stack.isEmpty()) return false;
                char topValue = stack.pop();
                if (c == ')' && topValue != '(') return false;
                if (c == '}' && topValue != '{') return false;
                if (c == ']' && topValue != '[') return false;
            }
        }
        return stack.isEmpty();

    }
}
