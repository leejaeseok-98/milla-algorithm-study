import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] arrCopy = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arr);

        HashMap<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], index);
                ++index;
            }
        }
        for (int i = 0; i < n; i++) {
            sb.append(map.get(arrCopy[i])).append(" ");
        }
        System.out.println(sb.toString());
    }
}
