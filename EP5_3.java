import java.util.Scanner;

class EP5_3 {
  private static int[][] fill(int[][] matriz) {
    int n = 1;

    for(int i = 0; i < matriz.length; i++) {
      if(i % 2 == 0) {
        for(int j = 0; j < matriz[i].length; j++) {
          matriz[i][j] = n;
          n++;
        }
      } else {
        for(int j = matriz[i].length - 1; j >= 0; j--) {
          matriz[i][j] = n;
          n++;
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

    matriz = EP5_3.fill(matriz);

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
         System.out.println(matriz[i][j]);
      }
    }
  }
}