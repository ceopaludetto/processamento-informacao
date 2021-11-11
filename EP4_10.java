import java.util.Scanner;

class EP4_10 {
  private static int findIndex(int[] current, int value) {
    for(int i = 0; i < current.length; i ++) {
      if(current[i] == value) {
        return i;
      }
    }
    return -1;
  }

  private static int[] reader(Scanner e, int[] vetor) {
    for(int i = 0; i < vetor.length; i++) {
      vetor[i] = e.nextInt();
    }

    return vetor;
  }

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
    int[] vetor = new int[n];
    
    vetor = EP4_10.reader(e, vetor);

    for(int i = 0; i < n; i++) {
      if(EP4_10.findIndex(vetor, vetor[i]) == i) {
        System.out.println(vetor[i]);
      }
    }
  }
}