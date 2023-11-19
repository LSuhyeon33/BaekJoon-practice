// 문제 번호    9498
// 문제 이름    시험 성적
// 문제 내용    시험 점수를 성적으로 바꾸는 문제

package scr.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2_9498 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int score = Integer.parseInt(br.readLine());
    
    if (score >= 90 && score <= 100) {
      System.out.println("A");
    } else if (score >= 80 && score < 90) {
      System.out.println("B");
    } else if (score >= 70 && score < 80) {
      System.out.println("C");
    } else if (score >= 60 && score < 70) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}
