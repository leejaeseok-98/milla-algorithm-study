package oneWeek;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < T; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (binarySearch(cards, target)){
                bw.write("1" + "\n");
            }
            else{
                bw.write("0" + "\n");
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
            else if (cards[mid] > target) {
                right = mid - 1;
            }
            else if (cards[mid] < target) {
                left = mid + 1;
            }
        }
        return false;
    }

}
