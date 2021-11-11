import java.util.Scanner;

class EP2_5 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    double a = e.nextDouble();
    double b = e.nextDouble();
    double c = e.nextDouble();

    if (a > b + c || b > a + c || c > a + b) {
      System.out.println("INVALIDO");
    } else {
      System.out.println("VALIDO");
    }
  }
}