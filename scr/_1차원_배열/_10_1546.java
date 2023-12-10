// 문제 번호    1546
// 문제 이름    평균
// 문제 내용    평균을 조작하는 문제

package scr._1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10_1546 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] scrArr = new int[n];
    double max = 0.0;

    for (int i=0; i<n; i++) {
      scrArr[i] = Integer.parseInt(st.nextToken());

      // find max score
      if (scrArr[i] > max)
        max = (double)scrArr[i];
    }

    int sum = 0;
    int i = 0;
    while (i < scrArr.length) {
      sum += scrArr[i];
      i++;
    }

    System.out.println((double)sum/max*100.0/n);

    br.close();
  }
}
