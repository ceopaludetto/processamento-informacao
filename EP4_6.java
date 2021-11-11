import java.util.Scanner;

class EP4_6 {
  private static int[] sort(int[] numbers, int n) {
    if(n < 1) {
      return numbers;
    }

    for(int i = 0; i < n; i++) {
      if(numbers[i] > numbers[i + 1]) {
        int temp = numbers[i];
        numbers[i] = numbers[i + 1];
        numbers[i + 1] = temp;
      }
    }

    return EP4_6.sort(numbers, n - 1);
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int[] numbers = new int[n];

    for(int i = 0; i < n; i++) {
      numbers[i] = e.nextInt();
    }

    e.close();

    numbers = EP4_6.sort(numbers, numbers.length - 1);

    for(int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}