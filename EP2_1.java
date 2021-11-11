import java.util.Scanner;

class EP2_1 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    double p1 = e.nextDouble();
    double p2 = e.nextDouble();

    double mf = (p1 + p2) / 2;
    System.out.printf("%.2f\n", mf);

    if (mf < 5) {
      double rec = e.nextDouble();
      double nova = (mf + rec) / 2;
      System.out.printf("%.2f\n", nova);

      if(nova < 5) {
        System.out.println("REPROVADO");
      } else {
        System.out.println("APROVADO");
      }
    } else {
      System.out.println("APROVADO");
    }

    e.close();
  
  }
}