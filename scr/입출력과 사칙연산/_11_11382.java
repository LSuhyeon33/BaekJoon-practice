// 문제 번호    11382
// 문제 이름    꼬마 정민
// 문제 내용    더 큰 수를 더하는 문제

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _11_11382 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    // (1 ≤ 입력값 ≤ 10^12)
    long sum = 0;
    for(int i=0;i<3 && st.hasMoreTokens();i++) {
      long a = Long.parseLong(st.nextToken());
      sum += a;
    }

    System.out.println(sum);
  }
}
