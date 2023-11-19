// 문제 번호    2525
// 문제 이름    오븐 시계
// 문제 내용    범위가 더 넓은 시간 계산 문제

package scr.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _6_2525 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int time = Integer.parseInt(br.readLine());

    m += time;
    h = (h + m/60)%24;
    m %= 60;

    System.out.printf("%d %d", h, m);
  }
}
