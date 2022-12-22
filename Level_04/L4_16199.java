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

		// 만 나이
        if(y1 == y2) {	
			// 만 나이와 연 나이가 0살 일 때
			System.out.println(age);
		}else{
			if(m1 > m2) {	
				// 출생 달이 현재 달 보다 크다면 생일이 아직 지나지 않았기 때문에 연 나이 보다 한 살 어리다.
				System.out.println(age - 1);
			}else if(m1 == m2){
				if(d1 <= d2) {
					// 생일이거나 생일이 지났을 경우라면 연 나이와 만 나이가 같다
					System.out.println(age);
				}else {
					// 생일이 지나기 전이라면 만 나이는 연 나이보다 한 살 어리다
					System.out.println(age - 1);
				}
			}else{
				System.out.println(age);
			}
		}
		// 세는 나이(연 나이에 한 살을 더해주면 맞다.)
		System.out.println(age + 1);
		// 연 나이
		System.out.println(age);
	}
        
}

