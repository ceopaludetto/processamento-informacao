import java.util.Scanner;

class EP1_6 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    double valor = e.nextDouble();

    valor = valor - (valor * 0.1);
    valor = valor - (valor * 0.1);

    System.out.printf("%.2f", valor);

    e.close();
  }
}