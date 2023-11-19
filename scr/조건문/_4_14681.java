// 문제 번호    14681
// 문제 이름    사분면 고르기
// 문제 내용    점이 어느 사분면에 있는지 알아내는 문제

package scr.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _4_14681 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());

    if (x>0 && y>0) {
      System.out.println(1);
    } else if (x<0 && y>0) {
      System.out.println(2);
    } else if (x<0 && y<0) {
      System.out.println(3);
    } else {
      System.out.println(4);
    }
  }
}
