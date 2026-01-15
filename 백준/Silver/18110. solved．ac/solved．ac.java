import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
// 1. 의견이 없는 경우 처리
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        // 2. 정렬 (상하위 15%를 찾기 위해 필수)
        Arrays.sort(scores);

        // 3. 제외할 인원 계산 (15% 반올림)
        int exclusionCount = (int) Math.round(n * 0.15);

        // 4. 제외된 범위를 제외한 나머지 합계 계산
        long sum = 0; // 합계는 안전하게 long이나 int 사용
        for (int i = exclusionCount; i < n - exclusionCount; i++) {
            sum += scores[i];
        }

        // 5. 평균 계산 및 반올림
        int remainingCount = n - (2 * exclusionCount);
        int result = (int) Math.round((double) sum / remainingCount);

        System.out.println(result);


    }
}
