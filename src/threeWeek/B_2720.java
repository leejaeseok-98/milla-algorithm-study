package threeWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class B_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TestCase = Integer.parseInt(br.readLine());
        int[] arr = {25,10,5,1};

        for (int i = 0; i < TestCase; i++) {
            int change = Integer.parseInt(br.readLine());
            if (change <= 500) {
//            선택 절차
                for (int j = 0; j < arr.length; j++) {
                   int result = change / arr[j];
                   sb.append(result + " ");
                   change %= arr[j];
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
