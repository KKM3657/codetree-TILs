import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());
        
        // System.out.println(Integer.toString(value,2));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();
        while(value > 0) {
            list.addFirst(value % 2);
            value /= 2;
        }

        for(Integer temp : list){
            sb.append(temp);
        }
        System.out.println(sb.toString());
    }
}