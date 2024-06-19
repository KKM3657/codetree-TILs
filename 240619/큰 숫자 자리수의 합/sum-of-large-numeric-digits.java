import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int value = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            value *= arr[i];
        }

        System.out.println(makeSum(value));
    }

    public static int makeSum(int value) {
        if(value < 10) {
            return value;
        }

        return makeSum(value / 10) + value % 10;
    }
}