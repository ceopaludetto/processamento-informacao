import java.util.Scanner;

class EP3_5 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int sum = 0;

    while(e.hasNextInt()) {
      int n = e.nextInt();

      if (n == 0) {
        e.close();
        System.out.println(sum);
        return;
      }

      sum += n;      
    }
  }
}