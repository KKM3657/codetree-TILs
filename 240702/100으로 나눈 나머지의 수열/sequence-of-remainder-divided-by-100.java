import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(findAnswer(N));
    }
    public static int findAnswer(int curr) {
        if(curr == 1)
            return 2;
        else if(curr == 2)
            return 4;
        
        return findAnswer(curr-1) * findAnswer(curr-2) % 100;
    }
}