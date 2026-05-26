class Solution {
    public int search(int[] nums, int target) {

        return helper(nums, target, 0);        

    }

    public int helper (int[] nums, int target, int indexOffset){
        int mid = nums.length/2;

        System.out.println("Current middle index " + mid);
        System.out.println("Current middle value " + nums[mid]);


        //mid is the target
        if (nums[mid] == target)
            return mid + indexOffset;
        
        //we have made the list small and still have not landed on a solution
        if (nums.length == 1 && nums[mid] != target)
            return -1;

        if (nums[mid] < target){
            return helper(Arrays.copyOfRange(nums, mid, nums.length), target, indexOffset+mid);
        }
        return helper(Arrays.copyOfRange(nums, 0, mid), target, 0);
    }



    
}
