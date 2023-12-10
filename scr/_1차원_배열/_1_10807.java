// 문제 번호    10807
// 문제 이름    개수 세기
// 문제 내용    배열을 입력받고 v를 찾는 문제

package scr._1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1_10807 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    // int[] numArray = null;
    StringTokenizer st = new StringTokenizer(br.readLine());

    int count = 0;
    int a = Integer.parseInt(br.readLine());

    for (int i=0; i<n; i++) {
      if (Integer.parseInt(st.nextToken()) == a)
        count += 1;
    }

    System.out.println(count);
  }
}