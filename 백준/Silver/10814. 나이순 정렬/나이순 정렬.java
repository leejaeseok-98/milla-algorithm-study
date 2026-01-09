import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, List<String>> member = new HashMap<>();

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            if (member.containsKey(age)){
                member.get(age).add(name);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(name);
                member.put(age,list);
            }
        }

        for (int i = 0; i < 201; i++){
            if (member.containsKey(i)){
                for (String name : member.get(i)){
                    bw.write(i + " " + name + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
