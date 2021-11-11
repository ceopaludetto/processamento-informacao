import java.util.Scanner;

class EP5_7 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int[][] m = new int[n][n];

    e.close();

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        m[i][j] = j + i + 1;
      }
    }

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        System.out.println(m[i][j]);
      }
    }
  }
}