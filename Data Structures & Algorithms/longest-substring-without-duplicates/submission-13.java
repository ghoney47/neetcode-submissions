class Solution {
    public int lengthOfLongestSubstring(String s) {
        // our sliding window is that of an arraylist that we grow throughout the traversal

        if (s.length() == 0)
            return 0;

        int i = 0;
        int out = 0;
        ArrayList<String> container = new ArrayList<>();
        while (i < s.length()){
            String curr = s.substring(i, i+1);

            //System.out.println(curr);

            while (container.contains(curr)){
                container.remove(0);
            }

            container.add(curr);
            out = (container.size() > out) ? container.size() : out;

            i++;
        }

        return out;

        
    }
}
