import java.util.Scanner;

class EP3_1 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();

    e.close();

    for(int i = 1; i <= n; i ++) {
      System.out.println(3 * i);
    }
  }
}