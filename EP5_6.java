import java.util.Scanner;

class EP5_6 {
  private static int[][] reader(Scanner e, int[][] matriz) {
    for(int i = 0; i < matriz.length; i++) {
      for(int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = e.nextInt();
      }
    }

    return matriz;
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int half = n / 2;

    int[][] matriz = new int[n][n];
    int[][] matriz1 = new int[n][half];
    int[][] matriz2 = new int[half][half];

    matriz = EP5_6.reader(e, matriz);

    e.close();

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < half; j++) {
        matriz1[i][j] = matriz[i][j] + matriz[i][n - 1 - j];
      }
    }

    for(int i = 0; i < half; i++) {
      for(int j = 0; j < half; j++) {
        matriz2[i][j] = matriz1[i][j] + matriz1[n - 1 -i][j];
      }
    }

    for(int i = 0; i < half; i++) {
      for(int j = 0; j < half; j++) {
        System.out.println(matriz2[i][j] + " ");
      }
    }
  }
}