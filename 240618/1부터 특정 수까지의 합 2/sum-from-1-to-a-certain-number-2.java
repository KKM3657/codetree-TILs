import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sumNumber(n));
    }

    public static int sumNumber(int curr) {
        if(curr == 1)
            return 1;
        return curr + sumNumber(curr-1);
    }
}