package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L4_15051 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A1 = Integer.parseInt(br.readLine());
        int A2 = Integer.parseInt(br.readLine());
        int A3 = Integer.parseInt(br.readLine());

        int result = Math.min(A2 * 2 + A3 * 4, Math.min(A1 * 2 + A3 * 2, A1 * 4 + A2 * 2));

        // 1층에 두었을 때, A2 * 2 + A3 * 4

        // 2층에 두었을 때, A1 * 2 + A3 * 2

        // 3층에 두었을 때, A1 * 4 + A2 * 2

        System.out.println(result);
    }
}
