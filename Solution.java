import java.util.Scanner;

/**
 * Solution
 */
public class Solution {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while(scanner.hasNextInt()){
      System.out.println(scanner.nextInt());
    }


    scanner.close();
  }
  
}