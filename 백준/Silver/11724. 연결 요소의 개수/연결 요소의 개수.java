
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 1; i <= n; i++){
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }

        int cnt = 0;

        for (int i = 1; i <= n; i++){
            if (!visited[i]){
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int v){
        if (visited[v]) return;
        visited[v] = true;
        for (int i = 0; i < A[v].size(); i++){
            int u = A[v].get(i);
            if (!visited[u]){
                dfs(u);
            }
        }
    }
}
