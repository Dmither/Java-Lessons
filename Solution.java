import java.util.Scanner;

/**
 * Solution
 */
public class Solution {
  private static final String TRIANGLE_EXISTS = "трикутник існує";
  private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";
  public static String string1 = "Аміго";
  public static String string2 = string1;
  public static String string3 = new String(string1);


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String answer = scanner.nextLine();

    String same = "посилання на рядки однакові";
    String different = "посилання на рядки різні";
    System.out.println(string1 == string2 ? same : different);
    System.out.println(string2 == string3 ? same : different);
    System.out.println(string1 == string3 ? same : different);
  }
  
}