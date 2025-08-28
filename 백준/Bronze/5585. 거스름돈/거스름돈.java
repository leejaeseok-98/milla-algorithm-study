import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pay = 1000;
        int[] coins = {500,100,50,10,5,1};
        int count = 0;
        int price = Integer.parseInt(br.readLine());
        int remain = pay - price;

        for (int i = 0; i < coins.length; i++) {
            count += (remain / coins[i]);
            remain %= coins[i];
        }

        System.out.println(count);
    }
}
