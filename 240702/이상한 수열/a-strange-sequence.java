import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(findAnswer(N));
    }
    public static int findAnswer(int curr) {
        if(curr == 1)
            return 1;
        else if (curr == 2)
            return 2;
        
        return findAnswer(curr/3) + findAnswer(curr-1);
    }
}