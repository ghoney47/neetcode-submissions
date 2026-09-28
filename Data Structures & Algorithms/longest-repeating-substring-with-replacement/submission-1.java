class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;


        // initializing left pointer and max freq counter
        int l = 0; int maxf = 0;

        // looping as the right pointer
        for (int r = 0; r < s.length(); r++){
            // the getOrDefault method allows for catching key DNE and will replace it with zero

            // updating the current counts with our current char
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);

            //update max freq 
            maxf = Math.max(count.get(s.charAt(r)), maxf);
            
            // the window size is r - l


            // the condition windowSize - maxf <= k tells us the substring is valid

            // here if we violate the condition, we must remove the value at the left (shrink) and 
            // reduce the frequency
            if ((r - l + 1) - maxf > k){
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1); // update the count
                l++; // pull in the left pointer
            }

            res = Math.max(res, r - l + 1);

        }

        return res;
    }
}
