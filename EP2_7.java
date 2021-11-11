import java.util.Scanner;

class EP2_7 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int a = e.nextInt();
    int b = e.nextInt();
    int c = e.nextInt();
    int aux;

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }

    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}