// import java.util.Stack;

class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        st.push(val);

        if (st2.empty() || val <= st2.peek()) {
            st2.push(val);
        }
    }

    public void pop() {
        if (!st.empty()) {
            int val = st.pop();

            if (!st2.empty() && val == st2.peek()) {
                st2.pop();
            }
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return st2.peek();
    }
}
