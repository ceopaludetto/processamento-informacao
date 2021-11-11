import java.util.Scanner;
import java.lang.Math;

class EP1_9 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int size = e.nextInt();
    long inGbBytes = size * (long)Math.pow(10, 9);
    long inGibBytes = size * (long)Math.pow(2, 30);

    long difference = inGibBytes - inGbBytes;

    System.out.println(inGbBytes);
    System.out.println(inGibBytes);
    System.out.println(difference);

    e.close();
  }
}