
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++){
            String str = sc.nextLine();
            String[] s = str.split(" ");
            if (s[0].equals("push")){
                queue.add(Integer.parseInt(s[1]));
            } else if (s[0].equals("pop")) {
                if (queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if (s[0].equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (s[0].equals("empty")) {
                if (queue.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (s[0].equals("front")) {
                if (queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peekFirst()).append("\n");
                }
            } else if (s[0].equals("back")) {
                if (queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
