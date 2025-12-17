import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static boolean arrive;
    public static void main(String[] args) {
        int N,M;
        arrive = false;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        list = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0; i < N;i++){
            list[i] = new ArrayList<>();
        }
        int depth = 1;
        for (int i = 0; i < M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 0; i < N;i++){
            DFS(i,depth);
            if (arrive){
                break;
            }
        }

        if (arrive) {
            System.out.println(1);
        }
        else System.out.println(0);

    }

        public static void DFS(int now, int depth) {
            if (arrive){
                return;
            }

            visited[now] = true;
            if (depth == 5){
                arrive = true;
                return;
            }
            for (int i = 0; i < list[now].size();i++){
                int next = list[now].get(i);
                if (!visited[next]) {
                    DFS(next, depth + 1);
                }
            }
            visited[now] = false;
        }
    }

