package Level_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L4_16199 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 출생 날짜
        int y1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        // 현재 날짜
        int y2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        // 연 나이
        int age = y2 - y1;

        if(y1 == y2) {
			System.out.println(age);
		}else{
			if(m1 > m2) {
				System.out.println(age - 1);
			}else if(m1 == m2){
				if(d1 <= d2) {
					System.out.println(age);
				}else {
					System.out.println(age - 1);
				}
			}else{
				System.out.println(age);
			}
		}
		System.out.println(age + 1);
		System.out.println(age);
	}
        
}

