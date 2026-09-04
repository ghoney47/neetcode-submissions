class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //we want to return the k most frequent elements
        int[] out = new int[k];

        // store value, count
        HashMap<Integer, Integer> counts = new HashMap<>();

        // adding the counts
        for (int i = 0; i < nums.length; i++){
            int currVal = 1;

            if (counts.get(nums[i]) != null){
                currVal = counts.get(nums[i]);
                currVal++;
            }
            counts.put(nums[i], currVal);
        }

        //finding the most frequent
        // num, count
        // max heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->Integer.compare(b[1], a[1]));
        
        counts.forEach((key, value) -> pq.add(new int[] {key, value}));

        for (int i = 0; i < out.length; i++){
            out[i] = pq.poll()[0];
        }

        return out;
        
    }
}
