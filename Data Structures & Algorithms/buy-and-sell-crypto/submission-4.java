class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        
        for (int i = 0; i < prices.length; i++){
            int price1 = prices[i];
            int tempMax = 0;

            for (int j = i + 1; j < prices.length; j++){
                int price2 = prices[j];
                

                if (price2 - price1 > tempMax)
                    tempMax = price2 - price1;

                
            }

            if (tempMax > maxP)
                maxP = tempMax;

        }
        return maxP;
    }
}
