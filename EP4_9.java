import java.util.Scanner;

class EP4_9 {
  private static int[] reader(Scanner e, int[] vetor) {
    for(int i = 0; i < vetor.length; i++) {
      vetor[i] = e.nextInt();
    }

    return vetor;
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int[] vetorA = new int[n];
    int[] vetorB = new int[n];

    vetorA = EP4_9.reader(e, vetorA);
    vetorB = EP4_9.reader(e, vetorB);

    int m = vetorB[0] / vetorA[0];
    boolean is = true;

    for(int i = 0; i < n; i++) {
      if(vetorB[i] / vetorA[i] != m) {
        is = false;
      }
    }

    if(is) System.out.println("SIM");
    else System.out.println("NAO");
  }
}