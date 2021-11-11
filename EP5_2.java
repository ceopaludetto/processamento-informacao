import java.util.Scanner;

class EP5_2 {
  private static int[][] reader(Scanner e, int[][] matriz) {
    for(int i = 0; i < matriz.length; i++) {
      for(int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = e.nextInt();
        if(j % 2 != 0) {
          matriz[i][j] *= 3;
        }
      }
    }

    return matriz;
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int m = e.nextInt();
    int[][] matriz = new int[n][m];

    matriz = EP5_2.reader(e, matriz);

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        System.out.println(matriz[i][j]);
      }
    }
  }
}