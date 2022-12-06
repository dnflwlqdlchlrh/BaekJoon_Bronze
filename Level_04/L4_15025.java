package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L4_15025 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        if(l + r == 0){
            System.out.println("Not a moose");
        } else if(l == r){
            System.out.printf("Even %d", l + r);
        } else if(l != r){
            System.out.printf("Odd %d", Math.max(l, r) * 2);
        } 

    }
}
