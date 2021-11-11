import java.util.Scanner;
import java.lang.Math;

class EP1_4 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    double aX = e.nextDouble();
    double aY = e.nextDouble();
    double bX = e.nextDouble();
    double bY = e.nextDouble();

    double distance = Math.sqrt(Math.pow(aX - bX, 2) + Math.pow(aY - bY, 2));

    System.out.printf("%.2f", distance);

    e.close();
  }
}