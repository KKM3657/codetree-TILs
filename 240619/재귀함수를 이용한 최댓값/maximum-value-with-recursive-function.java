import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer> list;
    static int N, answer = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        findMax(0);
    }

    public static void findMax(int curr) {
        // 종료 조건
        if(curr == N) {
            System.out.println(answer);
            System.exit(0);
        }

        // 최대값 찾기
        if(answer < list.get(curr))
            answer = list.get(curr);
        findMax(curr+1);
    }
}