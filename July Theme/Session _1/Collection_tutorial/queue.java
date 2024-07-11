import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // this framwork gives functionality of queue interface of the java collection framwork,
        // linkedlist is used to implement this and it extends list as well as queue
        Queue<Integer> q = new LinkedList<>();// we implement this using queue
        q.offer(10);// add also works same just if there is any problem in adding add wil
        q.offer(20);// throw exception where as offer will avoid that and return boolean
        q.offer(30);
        q.offer(40);

        System.out.println("queue : "+q);

        q.poll();// function removes and then return element in front

        System.out.println("Element after polling : "+q);

        // PEEK
        System.out.println("Using peek : "+ q.peek());

        // iterate
        // 1 method
        while(!q.isEmpty()){
            System.out.println(q.poll());// at last this gives null else in remove it will give exception
        }
    }
}