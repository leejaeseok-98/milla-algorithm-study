import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[21];

        for (int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            if (str.length == 1){
                if (str[0].equals("all")){
                    for (int j = 1; j <= 20; j++){
                        arr[j] = true;
                    }
                } else if (str[0].equals("empty")){
                    for (int j = 1; j <= 20; j++){
                        arr[j] = false;
                    }
                }
                continue;
            }
            String order = str[0];
            int num = Integer.parseInt(str[1]);
            if (order.equals("add")){
                arr[num] = true;
            }
            else if (order.equals("remove")){
                arr[num] = false;
            }
            else if (order.equals("check")) {
                if (arr[num]){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            else if (order.equals("toggle")) {
                if (arr[num]){
                    arr[num] = false;
                } else {
                    arr[num] = true;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
