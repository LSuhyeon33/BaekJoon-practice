// 문제 번호    10951
// 문제 이름    A+B - 4
// 문제 내용    입력이 끝날 때까지 A+B를 출력하는 문제

package scr.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _12_10951 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = br.readLine();
    while(input != null) {
      StringTokenizer st = new StringTokenizer(input);
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      
      bw.write((a+b) + "\n");

      input = br.readLine();
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
