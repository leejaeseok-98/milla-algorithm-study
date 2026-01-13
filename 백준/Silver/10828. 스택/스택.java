
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            String order = str[0];
            int num = 0;
            if(str.length == 2){
                num = Integer.parseInt(str[1]);
            }
            if (order.equals("push")){
                stack.push(num);
            } else if (order.equals("top")) {
                if (stack.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            } else if (order.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (order.equals("empty")) {
                if (stack.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (order.equals("pop")) {
                if (stack.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            }

        }
        System.out.println(sb.toString());
    }

}
