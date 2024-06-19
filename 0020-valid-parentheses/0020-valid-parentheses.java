class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();

        for (char c1 : s.toCharArray()) {
            if (c1 == '{' || c1 == '(' || c1 == '[') {
                stack.push(c1);
            } else if (!stack.isEmpty()) {
                if (c1 == +'}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c1 == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c1 == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}