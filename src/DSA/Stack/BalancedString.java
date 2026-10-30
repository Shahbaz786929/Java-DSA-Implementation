package DSA.Stack;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String s = "{[(])]}";
        System.out.println(isBalanced(s));
    }

    public static boolean isBalanced (String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty() || isPair(stack.pop(), ch)){
                    return true;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isPair (char ch1, char ch2) {
        if (ch1 == '{' && ch2 == '}' || ch1 == '[' && ch2 == ']' || ch1 == '(' && ch2 == ')') return true;
        else return false;
    }

}
