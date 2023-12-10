// 문제 번호    5597
// 문제 이름    과제 안 내신 분..?
// 문제 내용    과제 제출 기한이 지났습니다.

package scr._1차원_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _7_5597 {
  public static void main(String[] args) throws IOException {
    int[] std = new int[31];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for (int i=0; i<28; i++) {
      int student = Integer.parseInt(br.readLine());
      std[student-1] = 1;
    }

    for (int i=0; i<30; i++) {
      if(std[i] == 0)
        bw.write((i+1) + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
