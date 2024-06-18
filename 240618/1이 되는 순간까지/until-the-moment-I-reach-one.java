import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int answer = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        calculateNum(N);
    }

    public static void calculateNum(int curr) {
        if(curr == 1) {
            System.out.println(answer);
            System.exit(0);
        }
        answer++;
        if(curr % 2 == 0) {
            calculateNum(curr / 2);
        }
        else {
            calculateNum(curr / 3);
        }
    }
}