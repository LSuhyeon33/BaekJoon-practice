// 문제 번호    18108
// 문제 이름    1998년생인 내가 태국에서는 2541년생?!
// 문제 내용    식을 직접 세워서 계산하는 문제

// 서기
// 예수 그리스도가 태어난 해를 기원으로 하는 것
// 불기 : 서기 + 543
// 석가모니가 입멸한 해를 기원으로 하는 것 ~> 서기전 545년

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _8_18108 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int year = Integer.parseInt(br.readLine());

    System.out.println(year-543);
  }
}
