import java.util.PriorityQueue;
import java.util.Queue;

public class priorityq {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);// so we can add custom rule for priority
        // here this rules defines if subtractable it will give it higher priority
         // by default in queue smallest number has the maximum priority
        // in string dictionary wise priority wil be done
        pq.add(1);
        pq.add(2);
        pq.add(5);
        pq.add(3);

        System.out.println("Priority is changed "+pq);

    }
}
