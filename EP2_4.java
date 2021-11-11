import java.util.Scanner;

class EP2_4 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int ano = e.nextInt();
    int motor = e.nextInt();
    int distancia = e.nextInt();

    if(ano >= 1901) {
      if(ano >= 1901 && ano <= 2000 && (motor == 100 || motor == 101)) {
        System.out.println("SIM");
        return;
      }

      if(ano >= 2001 && ano <= 2020 && distancia > 5000) {
        System.out.println("SIM");
        return;
      }

      if(ano == 2021 && (motor == 200 || motor == 201) && distancia > 200) {
        System.out.println("SIM");
        return;
      }
    }

    System.out.println("NAO");
  }
}