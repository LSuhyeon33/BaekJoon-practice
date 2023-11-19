// 문제 번호    2753
// 문제 이름    윤년
// 문제 내용    윤년을 판별하는 문제

package scr.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _3_2753 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int year = Integer.parseInt(br.readLine());

    if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
