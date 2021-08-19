package programmers.더맵게;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] s, int K){
        int answer = 0;
        List<Integer> list = Arrays.stream(s).boxed().collect(Collectors.toList());
        PriorityQueue<Integer> q = new PriorityQueue<>(list);
        while (q.size()>=2 && q.peek()<K){
            int first = q.poll();
            int second = q.poll();
            first += 2*second;
            q.add(first);
            answer++;
        }
        if (q.peek()<K)
            return -1;
        else
            return answer;
    }
}
