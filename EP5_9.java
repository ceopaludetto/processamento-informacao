import java.util.Scanner;

class EP5_9 {
  private static int[][] reader(Scanner e, int[][] matriz) {
    for(int i = 0; i < matriz.length; i++) {
      for(int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = e.nextInt();
      }
    }

    return matriz;
  }

  private static boolean order(int[] line, boolean max) {
    for(int i = 1; i < line.length; i++) {
      if(max) {
        if(line[i - 1] < line[i]) return false;
      } else {
        if(line[i - 1] > line[i]) return false;
      }
    }

    return true;
  }

  private static boolean check(int[][] matriz) {
    for(int i = 0; i < matriz.length; i++) {
      boolean max = false;

      if(matriz[i][0] > matriz[i][matriz[i].length - 1]) {
        max = true;
      }

      for(int j = 0; j < matriz[i].length; j++) {
        if(matriz[i][j] % 10 != 0) {
          return false;
        }
      }

      if(!EP5_9.order(matriz[i], max)) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int m = e.nextInt();
    int[][] matriz = new int[n][m];

    matriz = EP5_9.reader(e, matriz);
    boolean is = EP5_9.check(matriz);

    if(is) System.out.println("SIM");
    else System.out.println("NAO");
  }
}