import java.util.Stack;

class reverse{

    // function to insert element at the bottom of the stack
    static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        // hold the top element and remove it
        int top = st.pop();

        // recursively call to reach the bottom
        insertAtBottom(st, x);

        st.push(top);
    }

    // function to reverse the stack
    static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) return;

        // hold the top element and remove it
        int top = st.pop();

        // reverse the remaining stack
        reverseStack(st);

        // insert the held element at the bottom
        insertAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        reverseStack(st);

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}