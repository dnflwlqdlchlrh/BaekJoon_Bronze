package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_14264 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double L = Double.parseDouble(br.readLine());

        double S = (Math.sqrt(3) / 4) * Math.pow(L, 2);

        System.out.println(S); 
    }
}
