package programmers.h_index;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] c) {
        List<Integer> list = Arrays.stream(c).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        int top = list.get(0);
        int cur = 0;
        while (true) {
            while (cur < c.length && c[cur] >= top) {
                cur++;
            }
            if (cur >= top && c.length - cur <= top) {
                return top;
            }
            top--;
        }
    }
}
