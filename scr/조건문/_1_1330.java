// 문제 번호    1330
// 문제 이름    두 수 비교하기
// 문제 내용    두 수를 비교한 결과를 출력하는 문제

package scr.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _1_1330 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    if (a > b) {
      System.out.println(">");
    } else if (a < b) {
      System.out.println("<");
    } else if (a == b) {
      System.out.println("==");
    }
  }
}
