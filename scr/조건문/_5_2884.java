// 문제 번호    2884
// 문제 이름    알람 시계
// 문제 내용    시간 계산 문제

package scr.조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5_2884 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    m -= 45;

    if (m < 0) {
      h = (h+24-1)%24;
      m += 60;
    }

    System.out.printf("%d %d", h, m);
  }
}
