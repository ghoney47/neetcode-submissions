class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        pre[0] = nums[0];
        post[nums.length-1] = nums[nums.length - 1];

        // prefix calc
        for (int i = 1; i < nums.length; i++){
            pre[i] = pre[i - 1] * nums[i];
        }

        // postfix calc
        for (int i = nums.length - 2; i >= 0; i--){
            post[i] = post[i + 1] * nums[i];
        }

        // a given index i's exception product is pre[i - 1] * post [i + 1]
        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                out[i] = post[i + 1];
            } else if (i == nums.length - 1){
                out[i] = pre[i - 1];
            } else {
                out[i] = pre[i - 1] * post[i + 1];
            }
        }

        return out;
        
    }
}  
