import java.util.*;

public class Deque {
    public static void main(String[] args) {
    java.util.Deque<Integer> deque = new LinkedList<>();

       deque.addFirst(1);
       deque.addFirst(2);
       deque.addFirst(3);

       System.out.println(deque);

       deque.removeFirst();
       System.out.println(deque);

       System.out.println("First el = " + deque.getFirst());
       System.out.println("Last el = " + deque.getLast());
    }
}
