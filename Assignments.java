import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Assignments {
    public static void reverseFirstK(Queue<Integer> queue, int k) {
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

    public static void generateBinary(int N) {
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 0; i < N; i++) {
            String curr = q.remove();

            System.out.print(curr + " ");


            q.add(curr + '0');
            q.add(curr + "1");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        generateBinary(N);

        // Queue<Integer> q = new LinkedList<>();

        // for (int i = 10; i <= 100; i += 10) {
        //     q.add(i);
        // }

        // int k = 5;

        // reverseFirstK(q, k);

        // System.out.println(q);
    }
}
