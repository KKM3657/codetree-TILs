import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(calculateNumber(n));
    }
    public static int calculateNumber(int num) {
        if(num < 10){
            return num * num;
        }

        return calculateNumber(num / 10) + ((num % 10) * (num % 10));
    }
}