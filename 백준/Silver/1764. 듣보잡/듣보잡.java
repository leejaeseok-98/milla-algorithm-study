import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        StringBuilder sb = new StringBuilder();
        TreeSet<String> ts = new TreeSet<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            String name = br.readLine();
            map.put(name, 1);
        }
        for (int i = 0; i < m; i++){
            String name = br.readLine();
            if (map.containsKey(name)){
                ts.add(name);
            }
        }
        System.out.println(ts.size());
        for (String s : ts){
            System.out.println(s);
        }
    }
}
