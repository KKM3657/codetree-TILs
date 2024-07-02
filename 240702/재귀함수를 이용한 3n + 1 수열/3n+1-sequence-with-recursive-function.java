import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = findAnswer(N);
        System.out.println(answer);
    }
    public static int findAnswer(int curr) {
        if(curr == 1)
            return 0;
        if(curr % 2 == 0) {
            return findAnswer(curr / 2) + 1;
        }
        else
            return findAnswer(curr * 3 + 1) + 1;
    }
}