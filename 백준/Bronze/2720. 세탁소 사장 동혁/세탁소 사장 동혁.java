import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[T][4];
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            while (num > 0) {
                if (num / 25 > 0) {
                    arr[i][0] = num / 25;
                    num %= 25;
                }
                if (num / 10 > 0) {
                    arr[i][1] = num / 10;
                    num %= 10;
                }
                if (num / 5 > 0) {
                    arr[i][2] = num / 5;
                    num %= 5;
                }
                if (num / 1 > 0) {
                    arr[i][3] = num / 1;
                    num %= 1;
                }
            }
        }
        for (int i = 0; i < T; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " " + arr[i][3]);
        }
    }
}
