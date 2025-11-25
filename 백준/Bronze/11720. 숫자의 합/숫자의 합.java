import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());
        String num = br.readLine();
        char[] arr = num.toCharArray();
        int result = 0;

        for (int i = 0; i < testNum; i++){
            result += arr[i] - '0';
        }

        System.out.println(result);
    }


}
