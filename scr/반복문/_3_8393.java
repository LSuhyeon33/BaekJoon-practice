// 문제 번호    8393
// 문제 이름    합
// 문제 내용    1부터 N까지의 합을 구하는 문제

package scr.반복문;

import java.util.Scanner;

public class _3_8393 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());

    int sum = 0;
    for (int i=1; i<=n; i++) 
      sum += i;

    System.out.println(sum);
    
    sc.close();
  }
}
