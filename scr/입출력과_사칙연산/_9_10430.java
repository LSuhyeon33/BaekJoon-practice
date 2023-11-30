// 문제 번호    10430
// 문제 이름    나머지
// 문제 내용    네 개의 계산식을 계산하는 문제

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _9_10430 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    double A = Double.parseDouble(st.nextToken());
    double B = Double.parseDouble(st.nextToken());
    double C = Double.parseDouble(st.nextToken());
    
    // (A+B)%C
    System.out.println((int)((A+B)%C));
    // ((A%C) + (B%C))%C
    System.out.println((int)(((A%C) + (B%C))%C));
    // (A×B)%C
    System.out.println((int)((A*B)%C));
    // ((A%C) × (B%C))%C
    System.out.println((int)(((A%C) * (B%C))%C));
  }
}