import java.util.Scanner;

class EP1_5 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int sum = 0;

    for(int i = 0; i < 7; i++) {
      sum += e.nextInt();
    }

    if(sum % 2 == 0) {
      System.out.println(0);
    } else {
      System.out.println(1);
    }

    e.close();
  }
}