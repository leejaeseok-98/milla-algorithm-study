package oneWeek;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (binarySearch(cards, target)){
                bw.write("1 ");
            }
            else{
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean binarySearch(int[] cards, int target) {
        int left = 0;
        int right = cards.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (cards[mid] == target) {
                return true;
            }
            else if (cards[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
