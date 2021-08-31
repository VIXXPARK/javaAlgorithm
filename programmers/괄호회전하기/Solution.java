package programmers.괄호회전하기;

import java.util.*;
public class Solution {
    public static void main(String[] args){
        System.out.println(solution("[](){}"));
    }
    public static int solution(String s) {
        char[] start = {'(','{','['};
        char[] end = {')','}',']'};
        int answer = 0;
        for(int i = 0 ; i < s.length(); i++){
            Stack<Character> stack = new Stack<>();
            int j = 0;
            for(j = 0 ; j < s.length(); j++){
                char key = s.charAt(j);
                if(is_start(key,start))
                    find(key,start,stack,true);
                else{
                    if(stack.size()!=0) {
                        int left = find(stack.peek(), start, stack, false);
                        int right = find(key, end, stack, false);
                        if (stack.size() != 0 && left == right)
                            stack.pop();
                    }else
                        break;
                }
            }
            if(stack.size()==0 && j == s.length())
                answer+=1;
            s = s.substring(1,s.length()) + s.substring(0,1);
        }
        return answer;
    }

    private static boolean is_start(char key, char[] start){
        for(int i = 0 ; i<start.length;i++)
            if(key == start[i])
                return true;
        return false;
    }

    private static int find(char key, char[] list,Stack<Character> stack, boolean term){
        for(int k = 0; k<3 ; k++){
            if(key == list[k]){
                if(term)
                {stack.push(key);}
                return k;
            }
        }
        return -1;
    }
}