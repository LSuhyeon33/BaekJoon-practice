// 문제 번호    2439
// 문제 이름    별 찍기 - 2
// 문제 내용    별을 찍는 문제 2

package scr.반복문;

import java.util.Scanner;

public class _10_2439 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.nextLine());
    String space = " ";
    String star = "*";

    for (int i=n-1; i>=0; i--) {
      System.out.print(space.repeat(i));
      System.out.println(star.repeat(n-i));
    }

    sc.close();
  }
}
