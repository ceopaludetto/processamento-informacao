import java.util.Scanner;

class EP4_5 {
  private static int[] change(int[] current, int i, int j) {
    if(i >= 0 && i < current.length && j >= 0 && j < current.length) {
      int aux = current[i];
      current[i] = current[j];
      current[j] = aux;

      return current;
    }

    return current;
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int[] current = new int[n];

    for(int idx = 0; idx < n; idx++) {
      current[idx] = e.nextInt();
    }

    int i = e.nextInt();
    int j = e.nextInt();

    current = EP4_5.change(current, i, j);

    for(int idx = 0; idx < current.length; idx++) {
      System.out.println(current[idx]);
    }
  }
}