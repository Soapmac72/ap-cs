import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.*;
class WildCard {
  int wildCount = 0;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String toReplace = "%";
    System.out.println("Input a string: ");
    String input = scan.nextLine();
    System.out.println(input);
    
    if (input.contains(toReplace) == false)
    {
      System.out.println("Error: no %");
    }else if (input.matches("[^a-zA-Z0-9]")) {
      System.out.println("Error: Incorrect characters");
    }else {
      System.out.println("Enter the replacement String:");
      String replacement = scan.nextLine();
      System.out.println(replacement);
      String replaced = input.replaceFirst(toReplace, replacement);
      System.out.println(replaced);
  }
 }
}

