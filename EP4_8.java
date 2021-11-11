import java.util.Scanner;

class EP4_8 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int[] valores = new int[n];

    for(int i = 0; i < n; i++) {
      valores[i] = e.nextInt();
    }

    e.close();

    boolean is = true;
    for(int i = 1; i < n; i++) {
      if(valores[i - 1] > valores[i]) is = false;
    }

    if(is) System.out.println("SIM");
    else System.out.println("NAO");
  }
}