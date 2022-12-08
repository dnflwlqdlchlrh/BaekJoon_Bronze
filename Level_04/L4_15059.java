package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * L4_15059
 */
public class L4_15059 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 배열을 이용한 풀이
        // int[] arr1 = new int[3];
        // int[] arr2 = new int[3];


        // for(int i = 0; i < arr1.length; i++){
        //     arr1[i] = Integer.parseInt(st.nextToken());
        // }
        // st = new StringTokenizer(br.readLine()," ");

        // for(int i = 0; i < arr2.length; i++){
        //     arr2[i] = Integer.parseInt(st.nextToken());
        // }

        // int result = 0;

        // for(int i = 0; i < arr1.length; i++){
        //     if(arr2[i] - arr1[i] >= 0){
        //         result += arr2[i] - arr1[i];
        //     }
        // }

        // System.out.println(result);

        int C1 = Integer.parseInt(st.nextToken());
        int B1 = Integer.parseInt(st.nextToken());
        int P1 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int C2 = Integer.parseInt(st.nextToken());
        int B2 = Integer.parseInt(st.nextToken());
        int P2 = Integer.parseInt(st.nextToken());

        int sum = 0;
        if(C1 <= C2){
            sum += C2 - C1;
        } 
        
        if(B1 <= B2){
            sum += B2 - B1;
        }
        
        if(P1 <= P2){
            sum += P2 - P1;
        }

        System.out.println(sum);
    }
}