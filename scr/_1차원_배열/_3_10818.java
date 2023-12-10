// 문제 번호    10818
// 문제 이름    최소, 최대
// 문제 내용    최솟값과 최댓값을 찾는 문제

package scr._1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _3_10818 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] array = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i=0; i<n; i++) {
      array[i] = Integer.parseInt(st.nextToken());
    }

    // 1. Using Stream
    // Stream() 시간 복잡도: O(n)
    System.out.println(Arrays.stream(array).min().getAsInt() + " " + Arrays.stream(array).max().getAsInt());
    
    // 2. Using Arrays.sort 
    // Arrays.sort() 시간 복잡도: 평균 : O(nlog(n)) / 최악 : O(n^2)
    Arrays.sort(array);
    System.out.println(array[0] + " " + array[n-1]);
  }
}
