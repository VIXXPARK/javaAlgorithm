class Solution{
    public int largestRectangleArea(int[] heights){
        int len = heights.length;
        Stact<Integer> s = new Stack<>();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int h = (i==len?0:heights[i]);
            if(s.isEmpty() || h>=heights[s.peek()]){
                s.push(i);
            }else{
                int top = s.pop();
                ans = Math.max(ans,heights[top]*(s.empty()?i:i-1-s.peek()));
                i--;
            }
        }
        return ans;
    }
}