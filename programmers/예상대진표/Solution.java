package programmers.예상대진표;

public class Solution {
    public int solution(int n, int a, int b){
        int half = n>>1;
        int expo = (Integer.toBinaryString(half)).length();
        return helper(half,expo,a,b);
    }
    private int helper(int half,int expo, int a, int b){
        if(Math.abs(a-b)==1 && (a-1)/2==(b-1)/2)
            return 1;
        if(a> half && b> half){
            expo -=1;
            a -= half;
            b -= half;
            half = half >>1;
            return helper(half,expo,a,b);
        }
        if((a > half && b<=half) || (b > half && a<=half)){
            return expo;
        }
        else{
            expo-=1;
            half = half >>1;
            return helper(half,expo,a,b);
        }
    }
}
