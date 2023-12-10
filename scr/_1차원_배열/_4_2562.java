// 문제 번호    2562
// 문제 이름    최댓값
// 문제 내용    최댓값이 어디에 있는지 찾는 문제

package scr._1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_2562 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int max = 0;
    int index = 0;
    for (int i=1; i<=9; i++) {
      int a = Integer.parseInt(br.readLine());

      if (a > max) {
        max = a;
        index = i;
      }
    }

    System.out.println(max + "\n" + index);
  }
 }
