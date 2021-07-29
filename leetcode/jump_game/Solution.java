class Solution{
    public boolean canJump(int[] nums){
        int target = nums.length -1;
        for (int i = nums.length-1 ; i >=0 ; i--) {
            if(i+nums[i]>=target){
                target=i;
            }
        }
        boolean answer = target ==0 ? true; false;
        return answer;
    }
}