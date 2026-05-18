class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;



        //get intial letter count
        HashMap<String, Integer> countsOne = new HashMap<String, Integer>();

        System.out.println("Getting Initial Count");

        for (int i = 0; i < s.length(); i++){
            String curr = s.substring(i, i+1);
            int count;

            if (!countsOne.containsKey(curr)){
                count = 1;
            } else {
                count = countsOne.get(curr);
                count++;
            }

            countsOne.put(curr, count);
        }

        System.out.println("Count for h string 1: " + countsOne.get("h"));

        System.out.println("Getting Secondary Count");

        //gets second letter count
        HashMap<String, Integer> countsTwo = new HashMap<String, Integer>();

        for (int i = 0; i < t.length(); i++){
            String curr = t.substring(i, i+1);
            int count;

            if (!countsTwo.containsKey(curr)){
                count = 1;
            } else {
                count = countsTwo.get(curr);
                count++;
            }

            countsTwo.put(curr, count);
        }

        System.out.println("Count for h string 2: " + countsTwo.get("h"));

        System.out.println("Comparing now");
        //compare both counts of each letter
        for (int i = 0; i < s.length(); i++){
            String comp = s.substring(i, i+1);
            int count1;
            int count2;

            if (countsTwo.get(comp) != null && countsOne.get(comp) != null){
                count1 = countsOne.get(comp);
                count2 = countsTwo.get(comp);
            } else {
                return false;
            }

            if(comp.equals("h"))
                System.out.println("count 1: " + count1 + ", count 2 " + count2);
            

            if (count1 != count2){
                System.out.println("Mismatch for letter " + comp);
                return false;
            }
        }

        System.out.println("Success, Anagram");
        return true;
    }
}
