// 문제 번호    10811
// 문제 이름    바구니 뒤집기
// 문제 내용    배열을 뒤집는 문제

package scr._1차원_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _9_10811 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] box = new int[n];

    // box setting
    for (int f=0; f<n; f++)
      box[f] = f+1;

    // box reverse
    for (int f=0; f<m; f++) {
      st = new StringTokenizer(br.readLine());

      int i = Integer.parseInt(st.nextToken())-1;   // array is start at 0
      int j = Integer.parseInt(st.nextToken())-1;

      while (i<j) {
        int temp = box[j];
        box[j--] = box[i];
        box[i++] = temp;
      }
    }

    // box print
    for (int f=0; f<n; f++)
      bw.write(box[f] + " ");

    br.close();
    bw.flush();
    bw.close();
  }
}