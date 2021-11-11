import java.util.Scanner;
import java.lang.Math;

class EP2_10 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int carga = e.nextInt();
    double aX = e.nextDouble();
    double aY = e.nextDouble();
    double bX = e.nextDouble();
    double bY = e.nextDouble();

     e.close();

    double distance = Math.sqrt(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2));
    System.out.printf("%.2f\n", distance);

    int autonomia = 18000;

    if (carga > 50000 && carga < 200000) {
      autonomia = 9000;
    }

    if (carga > 200000 && carga < 250000) {
      autonomia = 3000;
    }

    
    if (distance < autonomia) {
      System.out.println("SIM");
      return;
    }

    double restinho = (autonomia * 0.1) + autonomia;

    if (distance < restinho) {
      System.out.println("TALVEZ");
      return;
    }

    System.out.println("NAO");
  }
}