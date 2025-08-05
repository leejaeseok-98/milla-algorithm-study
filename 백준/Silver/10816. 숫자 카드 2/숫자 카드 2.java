import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        map을 이용해서 key는 숫자 카드를 value엔 카드 카운트를 넣는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> sansCard = new HashMap<>();
        int n = Integer.parseInt(br.readLine()); //상근이의 숫자 카드
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            sansCard.put(input,sansCard.getOrDefault(input,0)+1);
        }
        int m = Integer.parseInt(br.readLine());//구해야할 정수 개수
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            int input = Integer.parseInt(st.nextToken());
            sb.append(sansCard.getOrDefault(input, 0)).append(" ");
        }
        System.out.println(sb);

    }
}
