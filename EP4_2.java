import java.util.Scanner;

class EP4_2 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    int n = e.nextInt();
  
    double sum = 0;
    double[] notas = new double[n];
    String[] nomes = new String[n];

    for(int i = 0; i < n; i++) {
      nomes[i] = e.next();
      notas[i] = e.nextDouble();
      sum += notas[i];
    }

    e.close();

    double media = sum / n;

    for (int i = 0; i < n; i++) {
      if (notas[i] > media) {
        System.out.println(nomes[i]);
      }
    }
  }
}