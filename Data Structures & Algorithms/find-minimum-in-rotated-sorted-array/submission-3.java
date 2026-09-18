class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int out = nums[0];

        while (l <= r){

            int m = l + (r - l) / 2; // midpoint calculation while avoiding overflow


            // the first element of the rotated portion 
            System.out.println("Mid: " + m + " L: " + l + " R: " + r);

            // isolate to the left side
            if (nums[m] < nums[r]){
                out = Math.min(nums[m], out);
                r = m;

            } else { // right side

                out = Math.min(nums[m], out);
                l = m + 1;
            }
        }

        return out;
    }
}
