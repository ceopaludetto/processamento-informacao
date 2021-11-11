import java.util.Scanner;

class EP4_4 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int[] valores = new int[n];

    for(int i = 0; i < n; i++) {
      valores[i] = e.nextInt();
    }

    int sum = 0;

    for(int i = 0; i < n; i++) {
      if(i == 0) {
        if(valores[i + 1] == 1) {
          sum += valores[i];
        }

        continue;
      }

      if(i == n - 1) {
        if(valores[i - 1] == 1) {
          sum += valores[i];
        }

        continue;
      }

      if(valores[i + 1] == 1 || valores[i - 1] == 1) {
        sum += valores[i];
      }
    }

    e.close();

    System.out.println(sum);
  }
}