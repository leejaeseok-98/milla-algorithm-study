import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new int[node+1][node+1];
        visited = new boolean[node+1];
        for(int i = 0; i < line; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(start);
        visited = new boolean[node+1];
        sb.append("\n");
        bfs(start);
        System.out.println(sb.toString());
    }

    static void dfs(int start){
        visited[start] = true;
        sb.append(start).append(" ");
        for (int i = 0; i < graph.length; i++) {
            if (graph[start][i] == 1 && !visited[i]) dfs(i);
        }
    }

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        sb.append(start).append(" ");
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i = 1; i < graph.length; i++){
                if (graph[temp][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }

    }
}
