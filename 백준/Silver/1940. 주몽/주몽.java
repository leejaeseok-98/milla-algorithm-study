import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int start_index = 0;
        int end_index = N-1;
        while (start_index < end_index){
            if (arr[start_index] + arr[end_index] > M){
                end_index--;
            } else if (arr[start_index] + arr[end_index] < M) {
                start_index++;
            }else {
                cnt++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
