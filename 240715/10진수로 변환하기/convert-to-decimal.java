import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String value = br.readLine();
        // char[] arr = value.toCharArray();
        // int answer = 0;
        // for(int i=0; i<arr.length; i++) {
        //     answer = answer * 2 + ((int) arr[i] - '0');
        // }
        int answer = Integer.parseInt(br.readLine(),2);
        System.out.println(answer);
    }
}

/*
    num = num * 2 + binary[i]; 식을 만족한다
    자리수가 증가하면 2가 전 자리수에 곱해지므로 곱하기 2가 된다.
*/