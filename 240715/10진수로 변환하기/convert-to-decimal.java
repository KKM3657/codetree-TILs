import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();
        char[] arr = value.toCharArray();
        int answer = 0;
        for(int i=0; i<arr.length; i++) {
            answer = answer * 2 + ((int) arr[i] - '0');
        }
        System.out.println(answer);
    }
}