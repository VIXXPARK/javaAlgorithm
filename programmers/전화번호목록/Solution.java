package programmers.전화번호목록;
import java.util.*;
public class Solution {
    public boolean solution(String[] phone_book){
        Map<String,Boolean> map = new HashMap<>();
        for(String number: phone_book){
            map.put(number,true);
        }
        for(String number: phone_book){
            for (int i = 0; i < number.length(); i++) {
                String temp = number.substring(0,i);
                if (map.containsKey(temp))
                    return false;
            }
        }
        return true;
    }
}
