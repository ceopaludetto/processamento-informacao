import java.util.Scanner;

class EP1_7 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    char[] data = e.next().toCharArray();

    for(int i = 0; i < data.length; i++) {
      char ch = data[i];
      int n = (ch - '0') + 1;

      if (n >= 10) {
        data[i] = '0';
      } else {
        data[i] = (char)(n + '0');
      }
    }

    System.out.println(String.valueOf(data));

    e.close();
  }
}