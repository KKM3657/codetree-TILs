import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        printNumber(N);
    }

    public static void printNumber(int N) {
        if(N == 0) {
            return;
        }

        System.out.print(N + " ");
        printNumber(N-1);
        System.out.print(N + " ");
    }
}