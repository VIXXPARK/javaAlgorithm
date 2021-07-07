package leetcode.valid_parentheses;


import java.util.*;

class Solution {
    List<Character> open = Arrays.asList('(', '{', '[');
    List<Character> close = Arrays.asList(')', '}', ']');
    Stack<Character> stack = new Stack<>();

    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (open.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (!checkParentheses(i, s)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean checkParentheses(int i, String s) {
        if (!stack.isEmpty()) {
            if (isMatch(i, s)) {
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
    public boolean isMatch(int i, String s){
        return open.indexOf(stack.pop()) != close.indexOf(s.charAt(i));
    }
}