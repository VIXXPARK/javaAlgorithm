package Longest_SubString_Without_Repeating_Characters;
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int loc=map.get(s.charAt(i))+1;
                left=left>loc?left:loc;
            }
            int value = i-left+1;
            ans=ans<value?value:ans;
            map.put(s.charAt(i),i);
        }
        return ans;
    }  
}