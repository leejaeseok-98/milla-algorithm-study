import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0}; // 오른쪽, 왼쪽, 아래, 위
    static int[] dy = {0, 0, 1, -1};

    static class Point {
        int x, y;
        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = row.charAt(j) - '0'; // '1' -> 1, '0' -> 0
            }
        }

        bfs(0, 0);
        System.out.println(map[N-1][M-1]);
    }

    static void bfs(int y, int x) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(y, x));
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();

            for (int i = 0; i < 4; i++) {
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];

                if (ny >= 0 && ny < N && nx >= 0 && nx < M) {
                    if (!visited[ny][nx] && map[ny][nx] == 1) {
                        visited[ny][nx] = true;
                        map[ny][nx] = map[p.y][p.x] + 1; // 거리 누적
                        queue.add(new Point(ny, nx));
                    }
                }
            }
        }
    }
}