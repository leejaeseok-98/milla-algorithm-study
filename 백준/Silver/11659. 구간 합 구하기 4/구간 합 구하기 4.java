import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int totalElements = Integer.parseInt(st.nextToken());
        int totalLoopNum = Integer.parseInt(st.nextToken());
        int[] arr = new int[totalElements+1];

        StringTokenizer arrSt = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= totalElements;i++){
            arr[i] = Integer.parseInt(arrSt.nextToken());
        }
        for (int i = 2; i <= totalElements;i++){
            arr[i] += arr[i-1];
        }

        for (int i = 0; i < totalLoopNum; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            System.out.println(arr[end] - arr[start-1]);
        }

    }
}
