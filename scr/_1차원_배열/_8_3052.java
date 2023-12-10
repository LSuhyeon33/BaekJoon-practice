// 문제 번호    3052
// 문제 이름    나머지
// 문제 내용    배열을 활용하여 서로 다른 값의 개수를 찾는 문제

package scr._1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _8_3052 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] remain = new int[10];
    for (int i=0; i<10; i++) 
      remain[i] = Integer.parseInt(br.readLine()) % 42;
    
    remain = Arrays.stream(remain).distinct().toArray();

    System.out.println(remain.length);
  }
}
