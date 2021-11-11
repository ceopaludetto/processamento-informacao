import java.util.Scanner;

class EP3_4 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();

    e.close();

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}