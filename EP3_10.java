import java.util.Scanner;

class EP3_10 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();

    e.close();

    for(int i = 1; i <= n; i++) {
      for(int j = 0; j < n - i; j++) {
        System.out.print("-");
      }

      for(int j = 1; j < i * 2; j++) {
        System.out.print(1);
      }

      for(int j = 0; j < n - i; j++) {
        System.out.print("-");
      }

      System.out.println();
    }

    // System.out.println("Hello world!");
  }
}