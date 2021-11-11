import java.util.Scanner;

class EP3_3 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int estoque = e.nextInt();
    int n = e.nextInt();
    int sum = 0;

    for(int i = 0; i < n; i++) {
      int quantidade = e.nextInt();

      if (quantidade <= estoque) {
        sum++;
        estoque -= quantidade;
      }
    }

    e.close();

    System.out.println(sum);
  }
}