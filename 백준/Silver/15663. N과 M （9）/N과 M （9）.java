import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[] arr;
    static int[] pick;
    static boolean[] visited;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        pick = new int[m];
        Arrays.sort(arr);

        visited = new boolean[n];

        backTrack(0);
        System.out.println(sb.toString());
    }
    public static void backTrack(int depth) {
        if (depth == m){
            for (int i : pick){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        int lastUsed = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            if (arr[i] == lastUsed) {
                continue;
            }
            visited[i] = true;
            pick[depth] = arr[i];
            lastUsed = arr[i];
            
            backTrack(depth + 1);
            visited[i] = false;
        }
    }
}
