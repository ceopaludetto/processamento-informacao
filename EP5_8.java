import java.util.Scanner;

class EP5_8 {
  private static int[][] reader(Scanner e, int[][] matriz) {
    for(int i = 0; i < matriz.length; i++) {
      for(int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = e.nextInt();
      }
    }

    return matriz;
  }

  public static int[][] multiply(int[][] matriz1, int[][] matriz2, int n1, int m1, int m2) {
    int[][] product = new int[n1][m2];

    for(int i = 0; i < n1; i++) {
      for (int j = 0; j < m2; j++) {
        for (int k = 0; k < m1; k++) {
          product[i][j] += 3 * matriz1[i][k] * matriz2[k][j];
        }
      }
    }

    return product;
  }


  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n1 = e.nextInt();
    int m1 = e.nextInt();
    int n2 = e.nextInt();
    int m2 = e.nextInt();

    int[][] matriz1 = new int[n1][m1];
    int[][] matriz2 = new int[n2][m2];

    matriz1 = EP5_8.reader(e, matriz1);
    matriz2 = EP5_8.reader(e, matriz2);

    int[][] product = EP5_8.multiply(matriz1, matriz2, n1, m1, m2);

    for(int i = 0; i < product.length; i++) {
      for(int j = 0; j < product[i].length; j++) {
        System.out.println(product[i][j]);
      }
    }
  }
}