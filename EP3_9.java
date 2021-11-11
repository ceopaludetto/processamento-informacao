import java.util.Scanner;

class EP3_9 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    String n = e.nextLine();

    e.close();

    for(int i = n.length() - 1; i >= 0; i--) {
      System.out.println(n.charAt(i));
    }
  }
}