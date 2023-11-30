// 문제 번호    10952
// 문제 이름    A+B - 5
// 문제 내용    0 0이 들어올 때까지 A+B를 출력하는 문제

package scr.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11_10952 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    while(true) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if(a == 0 && b == 0)
        break;

      bw.write((a+b) + "\n");
    }
    
    br.close();
    bw.flush();
    bw.close();
  }
}
