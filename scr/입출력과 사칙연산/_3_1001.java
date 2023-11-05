// 문제 번호	  1001
// 문제 이름	  A-B
// 문제 내용	  두 수를 입력받고 뺄셈을 한 결과를 출력하는 문제

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _3_1001 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    System.out.println(a-b);
  }
}
