// 문제 번호    10810
// 문제 이름    공 넣기
// 문제 내용    배열에 값을 쓰는 문제

package scr._1차원_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _5_10810 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] num = new int[n];

    for (int f=0; f<m; f++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

      for (int g=i; g<=j; g++)
        num[g-1] = k;
    }

    for (int f=0; f<n; f++)
      bw.write(num[f] + " ");

    br.close();
    bw.flush();
    bw.close();
  }
}
