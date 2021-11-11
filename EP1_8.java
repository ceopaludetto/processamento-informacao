import java.util.Scanner;

class EP1_8 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int[] caixas = {0, 0, 0, 0};
    int capacidade = e.nextInt();

    while(capacidade > 0) {
      if(capacidade >= 500) {
        caixas[0] += 1;
        capacidade -= 500;
      } else if(capacidade >= 100) {
        caixas[1] += 1;
        capacidade -= 100;
      } else  if(capacidade >= 25) {
        caixas[2] += 1;
        capacidade -= 25;
      } else {
        caixas[3] += 1;
        capacidade -= 1;
      }
    }

    System.out.println(caixas[0]);
    System.out.println(caixas[1]);
    System.out.println(caixas[2]);
    System.out.println(caixas[3]);

    e.close();
  }
}