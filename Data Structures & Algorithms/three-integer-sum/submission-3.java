class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // now nums is in non-decresasing order
        List<List<Integer>> out = new ArrayList<>();
            
            // setting first triple value
            for (int i = 0; i < nums.length; i++){

                // we must have a negative value to be able to continue
                if (nums[i] > 0){
                    break;
                }
                         
                int j = i + 1;
                int k = nums.length - 1;

                while (j < k){
                    if (nums[i] + nums[j] + nums[k] > 0){
                        k--;
                    } else if (nums[i] + nums[j] + nums[k] < 0) {
                        j++;
                    } else {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]); temp.add(nums[j]); temp.add(nums[k]);

                        if (!out.contains(temp))
                            out.add(temp);

                        j++;
                        k--;
                    }
                }
            }

            return out;
        }
    }
