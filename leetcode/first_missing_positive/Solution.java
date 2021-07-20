class Solution {
    public int firstMissingPositive(int[] nums) {
        List<Integer> input = Arrays.stream(nums).boxed().collect(Collectors.toList());
        HashSet<Integer> set = new HashSet<>(input);
        int max = Collections.max(input);
        for(int i =1 ; i<=max; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return (max>=1) ? max+1:1;

    }
}