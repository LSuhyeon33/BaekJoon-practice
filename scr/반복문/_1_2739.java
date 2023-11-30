// 문제 번호    2739
// 문제 이름    구구단
// 문제 내용    구구단을 출력하는 문제

package scr.반복문;

import java.util.Scanner;

public class _1_2739 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());

    // print 구구단
    for (int i=1; i<10; i++) {
      System.out.printf("%d * %d = %d\n", n, i, n*i);
    }

    sc.close();
  }
}
