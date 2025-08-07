import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        System.out.println(binarySearch(arr, m));
    }

    private static Long binarySearch(int[] arr, int m){
        long low = 1;
        long high = arr[arr.length - 1];
        long result = 0L;

        while (low <= high) {
            long mid = (low + high) / 2;
            long count = 0L;
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            if (count >= m) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
