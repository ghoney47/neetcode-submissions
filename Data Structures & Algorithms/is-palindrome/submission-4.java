class Solution {
    public boolean isPalindrome(String s) {

        //cleaning input
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        s = s.toLowerCase();

        char[] sArr = s.toCharArray();

        //pointers moving towards each other until they cross 
        int i = 0;
        int j = sArr.length-1;

        while (i < j){

        if (sArr[i] != sArr[j]){
                System.out.println("Fails on " + sArr[i] + " and " + sArr[j]);
                return false;
            } else{
                i++; j--;
            }
        }

        return true;
    }
}
