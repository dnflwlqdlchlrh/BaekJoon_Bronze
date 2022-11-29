package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * B_14173
 */
public class L4_14173 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr1 = new int[4];
        
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());

        int[] arr2 = new int[4];

        for(int i = 0; i < arr2.length; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        int sum1 = Math.max(arr1[2], arr2[2]) - Math.min(arr1[0], arr2[0]);
        int sum2 = Math.max(arr1[1], arr2[1]) - Math.min(arr1[3], arr2[3]);
        int sum3 = Math.max(sum1, sum2);

        System.out.println(sum3 * sum3);
    }
}