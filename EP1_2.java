import java.util.Scanner;

class EP1_2 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    double n1 = e.nextDouble();
    double n2 = e.nextDouble();
    double n3 = e.nextDouble();

    double m = (n1 + n2 + n3) / 3;

    System.out.printf("%.2f", m);
  }
}