import java.util.*;

public class Main {
    static int n;
    static int[][] graph;
    static boolean[] visited;
    static int result = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 전체 사람 수
        int start = sc.nextInt(); // 시작 노드 (사람 1)
        int end = sc.nextInt(); // 도착 노드 (사람 2)
        int m = sc.nextInt(); // 관계 개수

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        dfs(start, end, 0);
        System.out.println(result);
    }

    static void dfs(int current, int target, int count) {
        visited[current] = true;

        if (current == target) {
            result = count;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[current][i] == 1) {
                dfs(i, target, count + 1);
            }
        }
    }
}