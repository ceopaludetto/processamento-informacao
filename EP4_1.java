import java.util.Scanner;

class EP4_1 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int[] numbers = new int[n];
    int max = 0;

    for(int i = 0; i < n; i++) {
      numbers[i] = e.nextInt();
      if(numbers[i] > max) {
        max = numbers[i];
      }
    }

    e.close();

    System.out.println(max);
  }
}