// 문제 번호    11021
// 문제 이름    A+B - 7
// 문제 내용    A+B를 조금 더 아름답게 출력하는 문제

package scr.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _7_11021 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(br.readLine());

    for (int i=1; i<=t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
