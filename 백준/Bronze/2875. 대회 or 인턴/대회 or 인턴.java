import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 여학생 수
        int M = Integer.parseInt(st.nextToken()); // 남학생 수
        int K = Integer.parseInt(st.nextToken()); // 인턴십 참가 수

        int team = Math.min(N / 2, M);
        int remain = N + M - team *3;

        while (remain < K){
            team--;
            remain = N + M - team *3;
        }
        System.out.println(team);
    }
}
