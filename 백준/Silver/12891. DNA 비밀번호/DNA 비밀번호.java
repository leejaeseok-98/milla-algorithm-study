import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int myArr[];
    static int[] checkArr;
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int cnt = 0;
        checkArr = new int[4];  //숫자 체크 배열

        String str = br.readLine();
        char[] charArray = str.toCharArray(); //원본 문자열 배열

        myArr = new int[4]; // 문자 카운팅 배열
        st = new StringTokenizer(br.readLine());
        checkSecret = 0; //

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++;
            }
        }

        for (int i = 0; i < p; i++) {
            Add(charArray[i]);
        }

        if (checkSecret == 4){
            cnt++;
        }

        for (int i = p; i<s;i++){
            int j = i-p;
            Add(charArray[i]);
            Remove(charArray[j]);
            if (checkSecret == 4){
                cnt++;
            }
        }


        System.out.println(cnt);
        br.close();

    }


    private static void Remove(char charArray) {
        switch (charArray) {
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char charArray) {
        switch (charArray){
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
}
