class Solution {
    public boolean isPalindrome(String s) {

        //cleaning input
        String[] badChars = {"!", "?", ">", "<", ".", ",", " ", "\'", ":"};

        for (String sym : badChars){
            s = s.replace(sym, "");
        }

        s = s.toLowerCase();

        //pointers moving towards each other until they cross 
        int i = 0;
        int j = s.length()-1;

        while (i < j){
            String currI = s.substring(i, i+1);
            String currJ = s.substring(j, j+1);

            if (!currI.toLowerCase().equals(currJ.toLowerCase())){
                System.out.println("Fails on " + currI + " and " + currJ);
                return false;
            } else{
                i++; j--;
            }
        }

        return true;
    }
}
