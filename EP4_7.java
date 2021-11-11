import java.util.Scanner;

class EP4_7 {
  private static int[] reverse(int[] numbers) {
    int[] reversed = new int[numbers.length];

    for(int i = 0; i < numbers.length; i++) {
      reversed[i] = numbers[numbers.length - i - 1];
    }

    return reversed;
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int[] left = new int[n / 2];
    int[] right = new int[n / 2];

    for(int i = 0; i < n / 2; i++) {
      left[i] = e.nextInt();
    }

    if(n % 2 != 0) {
      e.nextInt();
    }

    for(int i = 0; i < n / 2; i++) {
      right[i] = e.nextInt();
    }

    right = EP4_7.reverse(right);

    boolean is = true;
    for(int i = 0; i < n / 2; i++) {
      if(left[i] != right[i]) is = false;
    }

    e.close();

    if(is) System.out.println("SIM");
    else System.out.println("NAO");
  }
}