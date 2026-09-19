class MinStack {

    int minPtr;
    PriorityQueue<Integer> mins;
    ArrayList<Integer> stack;

    public MinStack() {
        stack = new ArrayList<>();
        mins = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.add(0, val);
        mins.add(val);
    }

    public void pop() {
        int elem = stack.remove(0);
        mins.remove(elem);
    }
    
    public int top() {
        return stack.get(0);
    }
    
    public int getMin() {
        return mins.peek();
    }
}
