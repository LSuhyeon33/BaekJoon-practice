// 문제 번호    2438
// 문제 이름    별 찍기 - 1
// 문제 내용    별을 찍는 문제 1

package scr.반복문;

import java.util.Scanner;

public class _9_2438 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    String s = "*";

    for (int i=1; i<=n; i++) {
      System.out.println(s.repeat(i));
    }

    sc.close();
  }
}
