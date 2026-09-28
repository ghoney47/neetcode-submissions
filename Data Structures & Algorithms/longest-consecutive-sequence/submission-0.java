class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> members = new HashSet<>();

        // intialize the set
        for (int n : nums){
            members.add(n);
        }

        int longest = 0;

        // iterate through the set
        for (int n : members){
            if (members.contains(n - 1)) continue; // continue if not a starting value

            int length = 1;
            // counting
            while (members.contains(n + length)){
                length++; // increment length so we are counting within the set
            }

            longest = Math.max(length, longest);
        }

        return longest;
    }
}
