package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L4_15080 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " :");

        int[] start = new int[3];
        int[] end = new int[3];

        for(int i = 0; i < start.length; i++){
            start[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " :");
        for(int i = 0; i < end.length; i++){
            end[i] = Integer.parseInt(st.nextToken());
        }

        int startTime = start[2] + start[1] * 60 + start[0] * 3600;
        int endTime = end[2] + end[1] * 60 + end[0] * 3600;
        
        if(startTime > endTime) {
           System.out.println(24 * 3600 - startTime + endTime); 
        } else {
            System.out.println(endTime - startTime);
        }

    }
}
