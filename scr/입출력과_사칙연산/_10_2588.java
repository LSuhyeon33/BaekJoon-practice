// 문제 번호    2588
// 문제 이름    곱셈
// 문제 내용    빈 칸에 들어갈 수는?

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _10_2588 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int copy_b = b;

    // 한자리씩 계산
    for (int i=0;i<3;i++) {
      
      int factor = b % 10;
      b /= 10;

      System.out.println(a*factor);
    }
    System.out.println(a*copy_b);
  }
}
