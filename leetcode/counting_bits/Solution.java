package leetcode.counting_bits;

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0]=0;
        for(int i=1;i<n+1;i++){
            ans[i]=ans[i&(i-1)]+1;//이전 수와 비교하고 더하기 1
        }
        return ans;
    }
}