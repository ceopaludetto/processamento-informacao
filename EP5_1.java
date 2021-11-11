import java.util.Scanner;

class EP5_1 {
  private static double[][] reader(Scanner e, double[][] matriz) {
    for(int i = 0; i < matriz.length; i++) {
      double sum = 0;

      for(int j = 0; j < matriz[i].length - 1; j++) {
        matriz[i][j] = e.nextDouble();
        sum += matriz[i][j];
      }

      matriz[i][matriz[i].length - 1] = sum / (matriz[i].length - 1);
    }

    return matriz;
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int m = e.nextInt();
    double[][] matriz = new double[n][m + 1];

    matriz = EP5_1.reader(e, matriz);

    for(int i = 0; i < matriz.length; i++) {
      for(int j = 0; j < matriz[i].length; j++) {
        System.out.printf("%.2f\n", matriz[i][j]);
      }
    }
  }
}