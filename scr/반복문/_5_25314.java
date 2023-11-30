// 문제 번호    25314
// 문제 이름    코딩은 체육과목 입니다.
// 문제 내용    코딩 공부를 잘 하여 이렇게 longlonglonglong...을 칠판에 적는 일이 없도록 합시다.

package scr.반복문;

import java.util.Scanner;

public class _5_25314 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());

    String s = "long ";
    s = s.repeat(n/4);

    System.out.println(s + "int");

    sc.close();
  }
}
