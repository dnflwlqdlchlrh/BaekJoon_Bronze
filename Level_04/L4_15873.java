package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_15873 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int A = Integer.parseInt(br.readLine());
        // 앞의 숫자가 두 자리 수 이하이고 뒤의 숫자가 한 자리 수일 때
        // int res = (A / 10) + (A % 10);

        // 앞의 숫자가 한 자리 수이고 뒤의 숫자가 두 자리 수 이하일 때
        // if (A / 10 > 10) {
        //     res = (A / 100) + (A % 100);
        // }

        // 앞과 뒤 모두 두 자리 수일 때(경우의 수는 1)
        // if (A == 1010) {
        //     res = 20;
        // }

        // System.out.println(res);

        String A = br.readLine();

        if(A.contains("1010")){
            System.out.println(20);
        } else if(A.contains("10")){
            A = A.replace("10", "");

            System.out.println(10 + Integer.parseInt(A));
        } else {
            String[] arr = A.split("");
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
        
    }
}
