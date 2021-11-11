import java.util.Scanner;

class EP2_6 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int d1 = e.nextInt();
    int m1 = e.nextInt();
    int a1 = e.nextInt();

    int d2 = e.nextInt();
    int m2 = e.nextInt();
    int a2 = e.nextInt();

    e.close();

    if (d1 == d2 && m1 == m2 && a1 == a2) {
      System.out.println("IGUAIS");
      return;
    }

    String date1 = "" + String.format("%04d", a1) + String.format("%02d", m1) + String.format("%02d", d1);
    String date2 = "" + String.format("%04d", a2) + String.format("%02d", m2) + String.format("%02d", d2);

    int dt1 = Integer.parseInt(date1);
    int dt2 = Integer.parseInt(date2);

    if(dt1 > dt2) {
      System.out.println("DATA2");
    } else {
      System.out.println("DATA1");
    }
  }
}