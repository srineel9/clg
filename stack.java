public class stack<T> {
    T[] data;
    int length;
    int top;
    stack(T[] a) {
        data = a;
        length = a.length;
        top = -1; 
    }
//first in last out 
    void push(T a) {
        if(top < length-1) {
            top++;
            data[top] = a;

        }
        else {
            System.out.println("stack overrflow");
        }

    }

    T pop() {
        T a = null;
        if(top == -1) {
            System.out.println("stack underflow ");
        }
        else{
            a= data[top];
            top--;
        }
        return a;

    }

    boolean isEmpty() {
        if(top == -1) {
            return true;

        }
        else {
            return false;
        }
    }

    void printStack() {
        if(top == -1) {
            System.out.println("Stack empty");

        }
        else {
            for(int i = top;i>=0;i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    class Stack{
        public static void main (String args[]) {
            Integer a[] = new Integer[2];
            stack<Integer> st = new stack<Integer>(a);
            st.push(5);
            st.printStack();
            st.push(6);
            st.push(7);
            st.printStack();
            st.pop();
            System.out.println("is empty?" + st.isEmpty());

        }
    }
    
}
