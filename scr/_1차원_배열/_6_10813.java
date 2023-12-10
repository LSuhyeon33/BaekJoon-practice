// 문제 번호    10813
// 문제 이름    공 바꾸기
// 문제 내용    배열의 값을 교환하는 문제

package scr._1차원_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _6_10813 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] box = new int[n];

    // 바구니 셋팅
    for (int f=0; f<n; f++) {
      box[f] = f+1;
    }

    for (int f=0; f<m; f++) {
      st = new StringTokenizer(br.readLine());

      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());

      // 공 교환
      int temp = box[i-1];
      box[i-1] = box[j-1];
      box[j-1] = temp;
    }

    for (int f=0; f<n; f++) 
      bw.write(box[f] + " ");
    
    br.close();
    bw.flush();
    bw.close();
  }
}
