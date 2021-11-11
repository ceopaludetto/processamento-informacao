import java.util.Scanner;

class EP2_8 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int x = e.nextInt();
    int y = e.nextInt();

    if (x <= 22 && x >= -800 && y <= 35 && y >= -20) {
      System.out.println("SIM");
      return;
    }

    System.out.println("NAO");
  }
}