class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];

        if (nums.length == 1)
            return nums[0];

        if (nums.length == 1)
            return nums[1];

        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                dp[i] = nums[i];
            }

            else if (i == 1){
                dp[i] = nums[i];
            } else if (i == 2) {
                dp[i] = nums[i] + dp[i - 2];
            }
            else { 
                dp[i] = nums[i] + Math.max(dp[i - 2], dp[i-3]);
            }

                        
        }

        

        return Math.max(dp[nums.length-1], dp[nums.length-2]);


        
    }
}
