import java.util.ArrayDeque;

public class arrdeq {
    // in dequeue you can add as well as delete from same queue from both the sides
    // useful in sliding window type question
    public static void main(String[] args) {
        // ArrayDeque<Integer> dq = new ArrayDeque<>();
        // dq.offer(10);// add from normal
        // dq.offerLast(20);// add from normal
        // dq.offerFirst(40);// add from front
        // dq.offer(90);

        // System.out.println(dq);

        // //poll
        // dq.poll();
        // System.out.println(dq);// remove first
        // System.out.println("PollLast "+dq.pollLast());// remove from last
        // System.out.println(dq);

        // // peek;
        // System.out.println(dq.peek());
        // System.out.println("Peek Last "+dq.peekLast());


        //------------------------------------------------------>
        // stack using dequeue.
        ArrayDeque<Integer> stk = new ArrayDeque<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        System.out.println(stk);

        System.out.println("Pop "+stk.pop());

        System.out.println("Peek "+stk.peek());

        // similarly we can use all method of queue - offer, poll

    }
}
