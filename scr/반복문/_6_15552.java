// 문제 번호    15552
// 문제 이름    빠른 A+B
// 문제 내용    빠르게 입력받고 출력하는 문제

package scr.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _6_15552 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int t = Integer.parseInt(br.readLine());
    
    for (int i=0; i<t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int a =  Integer.parseInt(st.nextToken());
      int b =  Integer.parseInt(st.nextToken());

      bw.write((a+b)+"\n");
    }
    br.close();
    
    bw.flush();
    bw.close();
  }
}