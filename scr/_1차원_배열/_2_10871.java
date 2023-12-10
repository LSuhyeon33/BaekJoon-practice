// 문제 번호    10871
// 문제 이름    X보다 작은 수
// 문제 내용    배열을 입력받고 X보다 작은 수를 찾는 문제

package scr._1차원_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2_10871 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());
    int[] numArray = new int[N];
    
    st = new StringTokenizer(br.readLine());
    for (int i=0; i<N; i++) {
      numArray[i] = Integer.parseInt(st.nextToken());
    }

    for (int i=0; i<N; i++) {
      if (numArray[i] < X) 
        bw.write(numArray[i] + " ");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
