class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> nums = new ArrayList<>();

        boolean carry = false;

        for (int i = digits.length - 1; i >= 0; i--){

            if (carry){
                carry = false;
                digits[i]++;
            }

            if (i == digits.length - 1){
                digits[i]++;
            }

            if (digits[i] >= 10){
                carry = true;

                //adding current value
                nums.add(0, (digits[i] % 10));
            } else{
                nums.add(0, digits[i]);
            }


            //adding extra place
            if (i == 0 && carry){
                nums.add(0, 1);
            }

        }

        int[] output = nums.stream().mapToInt(Integer::intValue).toArray();

        return output;
    }
}
