import java.util.Scanner;

class EP2_3 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int temperatura = e.nextInt();

    if(temperatura <= -20) {
      System.out.println("Muito Baixa");
    } else if(temperatura <= 30) {
      System.out.println("Baixa");
    } else if(temperatura <= 200) {
      System.out.println("Normal");
    } else if(temperatura <= 250) {
      System.out.println("Alta");
    } else {
      System.out.println("Muito Alta");
    }

    e.close();
  }
}