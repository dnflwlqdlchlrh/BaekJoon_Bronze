package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * L4_15610
 */
public class L4_15610 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());

        System.out.printf("%.8f", 4 * Math.sqrt(a
        ));
        
    }
    
}