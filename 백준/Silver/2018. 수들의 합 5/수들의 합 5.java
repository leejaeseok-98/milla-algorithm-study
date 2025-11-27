import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 1;
        int end_index = 1;
        int start_index = 1;
        int sum = 1;

        while(end_index != num){
            if (sum == num){
                cnt++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > num) {
                sum = sum - start_index;
                start_index++;
            } else {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(cnt);
    }
}
