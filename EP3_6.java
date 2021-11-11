import java.util.Scanner;

class EP3_6 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int sum = 0;

    e.close();

    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= 8; j++) {
        sum += (i + 1) * j;
      }
    }

    System.out.println(sum);
  }
}