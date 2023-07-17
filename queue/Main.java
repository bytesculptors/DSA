import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());

        System.out.println(queue.size());

        System.out.println(queue.contains("Steve"));

        // queue.poll();
        // queue.poll();
        // queue.poll();
        // queue.poll();
        // queue.element();

        System.out.println(queue);
    }
}
