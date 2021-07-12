public class Solution2 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int left = -1;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '(') stack.push(j);
            else {
                if (stack.isEmpty()) left = j; //만약에 valid한 괄호가 없다면 지금 위치를 시작위치로 둔다.
                else {
                    stack.pop();
                    if (stack.isEmpty()) max = Math.max(max, j - left); // 만약에 개구간을 버리고 나서 스택에 값이 저장되어 있지 않다면 값을 구하라.
                    else max = Math.max(max, j - stack.peek());// 그렇지 않다면 스택의 윗부분과 현재 위치의 값을 빼서 계산하라.
                }
            }
        }
        return max;
    }
}