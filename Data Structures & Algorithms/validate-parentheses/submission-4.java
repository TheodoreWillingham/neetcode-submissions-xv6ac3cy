class Solution {
    public boolean isValid(String s) {
        //keeps track of the string
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); //current character

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if (c == ')') {
                if (stack.pop() != '(') return false;
            } else if (c == '}') {
                if (stack.pop() != '{') return false;
            } else if (c == ']') {
                if (stack.pop() != '[') return false;
            }
        } 
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
