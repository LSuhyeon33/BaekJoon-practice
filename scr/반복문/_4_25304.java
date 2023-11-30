// 문제 번호    25304
// 문제 이름    영수증
// 문제 내용    💸

package scr.반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _4_25304 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int payment = Integer.parseInt(br.readLine());
    int N = Integer.parseInt(br.readLine());

    // check payment
    int sum = 0;
    for (int i=0; i<N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      sum += a*b;
    }

    if (payment == sum)
      System.out.println("Yes");
    else 
      System.out.println("No");
  }
}
