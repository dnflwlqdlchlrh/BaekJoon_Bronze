package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * L4_15680
 */
public class L4_15680 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N == 0){
            System.out.println("YONSEI");
        } else if(N == 1){
            System.out.println("Leading the Way to the Future");
        }
        
    }
    
}