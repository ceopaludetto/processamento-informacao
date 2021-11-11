import java.util.Scanner;

class EP3_8 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int i = 2;
    int sum = 0;

    e.close();

    while(sum < n) {
      boolean is = true;

      for(int j = 2; j < i; j++) {
        if(i % j == 0) is = false;
      }

      if(is) {
        System.out.println(i);
        sum++;
      };
      i++;
    }
  }
}