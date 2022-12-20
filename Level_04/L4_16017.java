package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_16017 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[4];

        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        if(num[0] > 7 && num[1] == num[2] && num[3] > 7){
            System.out.println("ignore");
               
        } else {
            System.out.println("answer");
        }
    }
}
