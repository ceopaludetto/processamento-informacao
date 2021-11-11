import java.util.Scanner;

class EP3_2 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    double sum = 0;
    int min = 1000000000;
    int max = 0;

    for (int i = 0; i < n; i ++) {
      int input = e.nextInt();

      sum += input;
      if (input < min) {
        min = input;
      }
      if (input > max) {
        max = input;
      }
    }

    e.close();

    double media = sum / n;

    System.out.printf("%.0f\n", sum);
    System.out.printf("%.2f\n", media);
    System.out.println(min);
    System.out.println(max);
  }
}