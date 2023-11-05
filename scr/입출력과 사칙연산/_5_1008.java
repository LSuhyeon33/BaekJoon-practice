// 문제 번호	  1008
// 문제 이름	  A/B
// 문제 내용	  나눗셈 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5_1008 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    double a = Double.parseDouble(st.nextToken());
    double b = Double.parseDouble(st.nextToken());

    System.out.println(a/b);
  }
}
