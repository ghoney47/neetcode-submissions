class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solu = {-1, -1};

        for (int i = 0; i < nums.length; i++){

            for (int j = i + 1; j < nums.length; j++){

                if (nums[i] + nums[j] == target){
                    solu[0] = i;
                    solu[1] = j;
                    return solu;
                }

            }

        }

        return solu;
    }
}
