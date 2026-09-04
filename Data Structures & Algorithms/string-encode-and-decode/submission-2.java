class Solution {

    // sender
    public String encode(List<String> strs) {
        String out = "";
        // we need to combine the list into one
        for (String s : strs){
            out += s + "//#//";
        }

        return out;
    }

    public List<String> decode(String str) {
        List<String> out = new ArrayList<>();

        int i = 0;

        // indexOf will provide the index of the first occurance
        while (str.length() > 0){
            int breakPoint = str.indexOf("//#//");

            if (breakPoint == -1)
                break;

            
            String addString = str.substring(i, breakPoint);

            //System.out.println(addString);
            out.add(addString);

            str = str.substring(breakPoint + 5, str.length());
            
        }

        return out;

    }
}
