package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * L4_14470
 */
public class L4_14470 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        int time = 0;
        if(A < 0){
            time = (A * -1) * C;
            A = 0;
        } 
        
        if(A == 0){
            time+=D;
        }

        if(A >= 0){
            time += (B - A) * E;
        }

        System.out.println(time);
    }
}