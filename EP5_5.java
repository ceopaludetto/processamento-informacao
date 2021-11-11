import java.util.Scanner;

class EP5_5 {
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
    int[][] matriz = new int[n][n];

    matriz = EP5_5.reader(e, matriz);
    int sum = 0;

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(j < i && matriz[i][j] % 2 == 0) {
          sum += matriz[i][j];
        }
      }
    }

    System.out.println(sum);
  }
}