import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int answer = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(fibo(n));
    }

    public static int fibo(int curr) {
        // 종료 조건
        if(curr == 2 || curr == 1)
            return 1;
        return fibo(curr-1) + fibo(curr-2);
    }
}