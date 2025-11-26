import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long cnt = 0;

        long[] s = new long[N];
        long[] c = new long[M];

        st = new StringTokenizer(br.readLine());
        s[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++){
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++){
            int remainder = (int) (s[i] %M);
            if (remainder == 0) cnt++;
            c[remainder]++;
        }
        for (int i = 0; i < M;i++){
            if (c[i] > 1){
                cnt = cnt + (c[i] * (c[i]-1)/2);
            }
        }
        System.out.println(cnt);
    }
}
