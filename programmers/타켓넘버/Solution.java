package programmers.타켓넘버;
import java.util.*;
public class Solution {
    List<Integer> list = new ArrayList<>();

    public int solution(int[] numbers, int target){
        helper(0,numbers,0);;
        int answer = (int)list.stream().filter(t -> t == target).count();
        return answer;
    }
    private void helper(int now, int[] numbers, int num){
        if( now == numbers.length){
            list.add(num);
            return;
        }else{
            helper(now+1,numbers,num+numbers[now]);
            helper(now+1,numbers,num-numbers[now]);
        }
    }
}
