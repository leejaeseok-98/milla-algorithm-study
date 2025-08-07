import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int TreeCount = Integer.parseInt(st.nextToken());
        int TreeLength = Integer.parseInt(st.nextToken());

        int[] arr = new int[TreeCount];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < TreeCount; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        System.out.println(binarySearch(arr, TreeLength, max));
    }

    private static int binarySearch(int[] arr,int TreeLength, int high) {
        int low = 0;
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            long sum = 0;
            for (int height : arr) {
                if (height > mid) {
                    sum += (height - mid);
                }
            }
            if (sum >= TreeLength) {
                result = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return result;
    }
}
