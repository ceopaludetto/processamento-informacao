import java.util.Scanner;

class EP5_4 {
  private static int[] sort(int[] numbers, int n) {
    if(n < 1) {
      return numbers;
    }

    for(int i = 0; i < n; i++) {
      if(numbers[i] > numbers[i + 1]) {
        int temp = numbers[i];
        numbers[i] = numbers[i + 1];
        numbers[i + 1] = temp;
      }
    }

    return EP5_4.sort(numbers, n - 1);
  }

  private static int[][] reader(Scanner e, int[][] matriz) {
    for(int i = 0; i < matriz.length; i++) {
      for(int j = matriz[i].length - 1; j >= 0; j--) {
        matriz[i][j] = e.nextInt();
      }
    }

    return matriz;
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int m = e.nextInt();
    int[][] matriz = new int[n][m];

    matriz = EP5_4.reader(e, matriz);

    for(int i = 0; i < n; i++) {
      matriz[i] = EP5_4.sort(matriz[i], matriz[i].length - 1);
    }

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        System.out.println(matriz[i][j]);
      }
    }
  }
}