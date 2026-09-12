// import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        int total = 0;

        for (int i = 0; i < tokens.length; i++) {

            if (!tokens[i].equals("+") &&
                !tokens[i].equals("-") &&
                !tokens[i].equals("*") &&
                !tokens[i].equals("/")) {

                st.push(Integer.parseInt(tokens[i]));
            }

            else {

                int b = st.pop();
                int a = st.pop();

                switch (tokens[i]) {

                    case "+":
                        total = a + b;
                        st.push(total);
                        break;

                    case "-":
                        total = a - b;
                        st.push(total);
                        break;

                    case "*":
                        total = a * b;
                        st.push(total);
                        break;

                    case "/":
                        total = a / b;
                        st.push(total);
                        break;
                }
            }
        }

        return st.pop();
    }
}
