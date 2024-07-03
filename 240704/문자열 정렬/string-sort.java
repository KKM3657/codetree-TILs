import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();

        char[] arr = value.toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);
        System.out.println(str);
    }
}