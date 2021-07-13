class Solution {
    public static void nextPermutation(int[] nums) {
        int size = nums.length;
        boolean stair = true;
        if (size <= 1) {
            return;
        } else {
            stair = (nums[size - 1] > nums[size - 2]) ? true : false;
            int turnningPoint = -1;
            for (int i = size - 1; i >= 0; i--) {
                if (stair) {
                    if (i > 0 && nums[i] < nums[i - 1]) {
                        turnningPoint = i;
                        break;
                    }
                } else {
                    if (i > 0 && nums[i] > nums[i - 1]) {
                        turnningPoint = i;
                        break;
                    }
                }
            }

            if (stair) {
                int tmp = nums[size - 1];
                nums[size - 1] = nums[size - 2];
                nums[size - 2] = tmp;

            } else {
                if (turnningPoint == -1) {
                    Arrays.sort(nums);
                } else {
                    int leftLarge = nums[turnningPoint - 1];
                    int rightSmall = 100;
                    int point = -1;
                    for (int i = turnningPoint; i < size; i++) {
                        if (leftLarge < nums[i] && rightSmall > nums[i]) {
                            point = i;
                            rightSmall = nums[i];
                        }
                    }
                    nums[turnningPoint - 1] = rightSmall;
                    nums[point] = leftLarge;
                    Arrays.sort(nums, turnningPoint, size);
                }
            }
        }
        return;
    }
}