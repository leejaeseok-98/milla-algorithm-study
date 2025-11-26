import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int table = Integer.parseInt(st.nextToken());
        int loopNum = Integer.parseInt(st.nextToken());
        int[][] arr = new int[table+1][table+1];

        for(int i = 1; i <= table;i++){
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 1; j <= table; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] partPlus = new int[table+1][table+1];
        for (int i = 1; i <= table; i++){
            for (int j = 1; j <= table; j++){
                partPlus[i][j] = partPlus[i][j-1] + partPlus[i-1][j] - partPlus[i-1][j-1] + arr[i][j];
            }
        }

        for (int i = 2; i <= table; i++){
            for (int j = 2; j <= table; j++){
                partPlus[i][j] = partPlus[i-1][j] + partPlus[i][j-1] - partPlus[i-1][j-1] + arr[i][j];
            }
        }

        for (int i = 0; i < loopNum; i++){
            int result = 0;
            st = new StringTokenizer(br.readLine()," ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            result = partPlus[x2][y2] - partPlus[x2][y1-1] - partPlus[x1-1][y2] + partPlus[x1-1][y1-1];
            System.out.println(result);
        }

    }
}
