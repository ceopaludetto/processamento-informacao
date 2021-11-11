import java.util.Scanner;

class EP1_3 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int a = e.nextInt();
    int b = e.nextInt();

    int soma = a + b;
    int sub = a - b;
    int mult = a * b;

    double aD = a, bD = b;
    double div = aD / bD;

    int divi = a / b;
    int mod = a % b;

    System.out.println(soma);
    System.out.println(sub);
    System.out.println(mult);
    System.out.println(div);
    System.out.println(divi);
    System.out.println(mod);
  }
}