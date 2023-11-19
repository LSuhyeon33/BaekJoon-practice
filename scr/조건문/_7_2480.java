// 문제 번호    2480
// 문제 이름    주사위 세개
// 문제 내용    조건에 따라 상금을 계산하는 문제

package scr.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _7_2480 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int f_dice = Integer.parseInt(st.nextToken());
    int s_dice = Integer.parseInt(st.nextToken());
    int t_dice = Integer.parseInt(st.nextToken());

    // Find max_dice
    int max_dice = 0;
    // if (f_dice >= s_dice) {
    //   if (f_dice >= t_dice) {
    //     max_dice = f_dice;
    //   } else {
    //     max_dice = t_dice;
    //   }
    // } else {
    //   if (s_dice >= t_dice) {
    //     max_dice = s_dice;
    //   } else {
    //     max_dice = t_dice;
    //   }
    // }
    // +Using Math.max function
    max_dice = Math.max(f_dice, Math.max(s_dice, t_dice));
    
    // Calculate prize money
    int prize = 0;
    if (f_dice == s_dice && s_dice == t_dice) {
      prize = 10000 + f_dice*1000;
    } else if (f_dice == s_dice || f_dice == t_dice) {
      prize = 1000 + f_dice*100;
    } else if (s_dice == t_dice) {
      prize = 1000 + s_dice*100;
    } else {
      prize = max_dice*100;
    }

    System.out.println(prize);
  }
}
