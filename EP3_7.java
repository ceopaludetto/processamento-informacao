import java.util.Scanner;

class EP3_7 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int per3 = 0;
    int per5 = 0;

    while(e.hasNextInt()) {
      int n = e.nextInt();

      if (n == 0) {
        e.close();
        System.out.println(per3);
        System.out.println(per5);
        return;
      }

      if (n % 3 == 0) per3++;
      if (n % 5 == 0) per5++;
    }
  }
}