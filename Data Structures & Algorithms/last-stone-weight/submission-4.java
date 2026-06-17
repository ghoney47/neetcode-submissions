class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> st = Arrays.stream(stones).boxed().collect(Collectors.toCollection(ArrayList::new));
        
        while (st.size() > 1){
            Collections.sort(st, Collections.reverseOrder());
            int x = st.get(0);
            int y = st.get(1);

            if (x == y){
                st.remove(0);
                st.remove(0);
            }

            if (x > y){
                //removing y
                st.remove(1);

                //update x's value
                x = x - y;
                st.add(0, x);

                //remove old x value
                st.remove(1);
            }

            System.out.println(st.toString());
        }

        if (st.size() == 0){
            return 0;
        }

        return st.get(0);
    }
}
