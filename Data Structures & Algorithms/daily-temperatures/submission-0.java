class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // stored as [index, temp]
        ArrayList<int[]> stack = new ArrayList<>();
        int[] out = new int[temperatures.length];

        // monotonically decreasing stack

        for (int i = 0; i < temperatures.length; i++){

            // computation phase where we look to calculate only if the current temp is greater than the top of our stack 
            while (stack.size() > 0 && temperatures[i] > stack.get(0)[1]){

                // find the value that violates the monotonic
                int[] currTuple = stack.remove(0);
                int currInd = currTuple[0];
                int currTemp = currTuple[1];

                out[currInd] = i - currInd;
            }

            int[] newTup = {i, temperatures[i]};

            stack.add(0, newTup);
        }

        return out;
    }
}
