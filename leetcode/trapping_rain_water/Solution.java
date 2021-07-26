class Solution{
    public int trap(int[] height){
        int left=0,right=0;
        int[] level = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            left=Math.max(left,height[i]);
            level[i]=left;
        }
        int res = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            right=Math.max(right,height[i]);
            res += Math.min(level[i],right) - height[i];
        }
        return res;
    }
}