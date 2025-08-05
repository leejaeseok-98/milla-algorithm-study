package oneWeek;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int t = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(upperBound(cards, target) - lowerBound(cards, target)).append(" ");
        }
        br.close();
        System.out.println(sb.toString());
    }

    private static int upperBound(int[] arr, int target) {
        int lo = 0, hi = arr.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > target) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return hi;
    }

    private static int lowerBound(int[] arr, int target) {
        int lo = 0, hi = arr.length;

        while (lo < hi) {
            int mid = (lo + hi) /2;
            if (arr[mid] >= target) {
                hi = mid;
            }
             else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
