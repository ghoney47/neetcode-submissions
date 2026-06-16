class KthLargest {

    ArrayList<Integer> mem;
    int k;

    public KthLargest(int k, int[] nums) {
        mem = new ArrayList<Integer>();
        this.k = k;

        for (int i : nums){
            mem.add(i);
        }
        Collections.sort(mem);
    }
    
    public int add(int val) {
        mem.add(val);

        Collections.sort(mem);
        return mem.get(mem.size()-k);
    }
}
