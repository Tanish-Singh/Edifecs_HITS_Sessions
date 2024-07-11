// import java.util.LinkedList;
// import java.util.List;

import java.util.Stack;

public class lists2 {
    public static void main(String[] args) {
        // linked list class of java ollection framework provides functionality of the linked list data
        // structure (doubly linked list).
        // elements in linked lists are not stored in sequence. instead they are scattered and connected
        // through links
        // usage
        // List<String> ll = new LinkedList<>();// similarly all functions of list work with linked list
        // as well as vector class

        // vector each class synchronizes each individual operation. this means whenever we
        // want to perform some operation on vectors, the vector class automatically applies
        // lock to that operation.

        // java stack elements are accessed in last in first out manner. 
        // that is element are added to te top of the stacl and removed from the top of the stack
        // push pop peek boolean are specialized for stack, this implementation also from list 
        // list fucntions will work with them and specialized for stack will also work
        Stack<String> st = new Stack<>();
        st.push("First");
        st.push("Second");
        st.push("Third");
        st.push("Fourth");
        System.out.println("Stack elements "+st);

        //pop
        st.pop();
        System.out.println("First time pop "+st);
        st.pop();
        System.out.println("Second time pop "+st);

        // peek - to see element at top
        System.out.println(st.peek());

        // .empty to check if stack is empty or not
        System.out.println(st.empty());


    }
}
