// [Method 1] Using Scanner 
// import java.util.Scanner;

// public class aAddb {
//   public static void main(String[] args) {
//     int a, b;

//     Scanner scanner = new Scanner(System.in);
//     a = scanner.nextInt();
//     b = scanner.nextInt();
//     scanner.close();

//     System.out.println(a+b);
//   }
// }

// [Method 2] Using BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 2_1000 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str," ");
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    System.out.println(a+b);
  }
}