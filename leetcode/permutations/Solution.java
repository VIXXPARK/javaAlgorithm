import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        List<Integer> ele = new ArrayList<>();
        generator(res,check,nums,ele);
    }
    private void generator(List<List<Integer>> res, boolean[] check, int[] nums, List<Integer> ele){
        if(ele.size()==nums.length){
            res.add(new ArrayList<>(ele));
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            if(!check[i]){
                ele.add(nums[i]);
                check[i]=true;
                generator(res,check,nums,ele);
                ele.remove(ele.size()-1);
                check[i]=false;
            }
        }
    }
}