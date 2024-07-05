import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken());
        String start = st.nextToken();

        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<N; i++) {
            String word = br.readLine();
            if(start.length() > word.length())
                continue;
            String temp = word.substring(0,start.length());
            if(temp.equals(start)){
                list.add(word);
            }
        }
        Collections.sort(list);
        if(!list.isEmpty())
            System.out.println(list.get(idx-1));
        else
            System.out.println(list.get(idx));
    }
}