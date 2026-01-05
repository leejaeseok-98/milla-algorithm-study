import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = 31;
        int m = 1234567891;

        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long result = 0;

        char[] a = new char[l];
        a = str.toCharArray();

        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = a[i] - '`';
        }
        for (int i = 0; i < l; i++) {
            result += (long) (arr[i] * Math.pow(r,i));
        }

        System.out.println(result % m);


    }
}
