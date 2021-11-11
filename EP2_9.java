import java.util.Scanner;
import java.util.HashMap;

class EP2_9 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    HashMap<String, String> planets = new HashMap<String, String>();
    HashMap<String, String> models = new HashMap<String, String>();

    planets.put("80", "Marte");
    planets.put("81", "Saturno");
    planets.put("90", "Netuno");
    planets.put("91", "HD21749b");

    models.put("60", "A6000");
    models.put("61", "B7500");
    models.put("62", "C9000");

    String code = e.nextLine();

    for(int i = 0; i < code.length(); i += 2) {
      String part = "" + code.charAt(i) + code.charAt(i + 1);

      if(i >= 4) {
        System.out.println(models.get(part));
      } else {
        System.out.println(planets.get(part));
      }
    }

    e.close();
  }
}