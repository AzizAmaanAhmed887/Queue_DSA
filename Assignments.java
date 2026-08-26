import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Assignments {
    static void reverseFirstK(Queue<Integer> queue, int k) {
        Stack<Integer> st = new Stack<>();

        // 1. Remove first k els
        for (int i = 0; i < k; i++) {
            st.push(queue.remove());
        }

        // 2. Stack -> Queue
        while (!st.isEmpty()) {
            queue.add(st.pop());
        }

        // 3. Move remaining el
        int remaining = queue.size() - k;

        for (int i = 0; i < remaining; i++) {
            queue.add(queue.remove());
        }
    }

    static void generateBinary(int N) {
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 0; i < N; i++) {
            String curr = q.remove();

            System.out.print(curr + " ");

            q.add(curr + '0');
            q.add(curr + "1");
        }
    }

    static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int a = pq.remove();
            int b = pq.remove();

            int sum = a + b;

            cost += sum;

            pq.add(sum);
        }

        return cost;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 6 };

        System.out.println(minCost(arr)); // Calculates Minimum cost

        // int N = 5;
        // generateBinary(N);

        // Queue<Integer> q = new LinkedList<>();

        // for (int i = 10; i <= 100; i += 10) {
        // q.add(i);
        // }

        // int k = 5;

        // reverseFirstK(q, k);

        // System.out.println(q);
    }
}
