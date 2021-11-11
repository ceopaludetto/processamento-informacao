import java.util.Scanner;

class EP2_2 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    double salario = e.nextDouble();
    double vendas = e.nextDouble();

    double comissao = vendas * 0.2;

    System.out.printf("%.2f\n", comissao);

    if (comissao >= salario * 0.5) {
      System.out.println("Atingiu meta de vendas");
    } else {
      System.out.println("Nao atingiu meta de vendas");
    }

    e.close();
  }
}