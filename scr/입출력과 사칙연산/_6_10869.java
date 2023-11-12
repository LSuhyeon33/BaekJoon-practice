// 문제 번호    10869
// 문제 이름    사칙연산
// 문제 내용    모든 연산 문제

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _6_10869 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    // using println 
    // System.out.println(a+b);
    // System.out.println(a-b);
    // System.out.println(a*b);
    // System.out.println(a/b);
    // System.out.println(a%b);

    // using printf
    System.out.printf("%d\n%d\n%d\n%d\n%d", a+b, a-b, a*b, a/b, a%b);
  }
}
