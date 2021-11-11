import java.util.Scanner;

class EP1_10 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    double vp = e.nextInt();
    double fn = e.nextInt();
    double fp = e.nextInt();
    double vn = e.nextInt();

    double acuracia = (vp + vn)/(vp + vn + fp + fn);
    double precisao = vp/(vp + fp);
    double sensibilidade = vp/(vp + fn);

    System.out.printf("%.2f\n", acuracia);
    System.out.printf("%.2f\n", precisao);
    System.out.printf("%.2f\n", sensibilidade);

    e.close();
  }
}