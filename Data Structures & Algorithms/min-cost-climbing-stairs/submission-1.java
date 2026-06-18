class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int[] output = new int[cost.length];

        for (int i = 0; i < cost.length; i++){


            if (i == 0){
                output[i] = cost[i];
            } else if (i == 1){

                output[i] = cost[i];
            
            } else {
                output[i] = cost[i] + Math.min(output[i-1], output[i-2]);
            }

            System.out.println("Ouput index " + i + " is " + output[i]); 
        }

        return Math.min(output[cost.length-1], output[cost.length-2]);

    }
}
