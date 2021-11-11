import java.util.Scanner;

class EP4_3 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int pares = 0;
    int impares = 0;

    for(int i = 0; i < n; i++) {
      int numero = e.nextInt();

      if(numero % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }

    e.close();

    System.out.println(pares);
    System.out.println(impares);
  }
}