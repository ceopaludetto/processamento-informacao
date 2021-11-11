import java.util.Scanner;

class EP5_10 {
  private static int[][] reader(Scanner e, int[][] matriz) {
    for(int i = 0; i < matriz.length; i++) {
      for(int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = e.nextInt();
      }
    }

    return matriz;
  }

  private static int check(int[][] matriz, int x, int y) {
    int sum = 0;
  
    boolean top = x != 0;
    boolean left = y != 0;
    boolean bottom = x != matriz.length - 1;
    boolean right = y != matriz[0].length - 1;

    if(top) {
      if(matriz[x - 1][y] == 1) {
        sum++;
      }

      if(left && matriz[x - 1][y - 1] == 1) {
        sum++;
      }

      if(right && matriz[x - 1][y + 1] == 1) {
        sum++;
      }
    }

    if(bottom) {
      if(matriz[x + 1][y] == 1) {
        sum++;
      }

      if(left && matriz[x + 1][y - 1] == 1) {
        sum++;
      }

      if(right && matriz[x + 1][y + 1] == 1) {
        sum++;
      }
    }

    if(left && matriz[x][y - 1] == 1) {
      sum++;
    }

    if(right && matriz[x][y + 1] == 1) {
      sum++;
    }

    return sum;
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int m = e.nextInt();
    int[][] matriz = new int[n][m];

    matriz = EP5_10.reader(e, matriz);

    int x = e.nextInt();
    int y = e.nextInt();

    int sum = EP5_10.check(matriz, x, y);

    System.out.println(sum);
  }
}