import java.util.Scanner;
class ReverseString
{
  public static String[] list = new String[5];
  public static String curString = "";
  public static Scanner scan = new Scanner(System.in);
  public static void main(String[] args)
  {
    for (int i = 0; i < list.length; i++)
    {
      list[i] = scan.nextLine();
      curString = list[i];
      char[] curChars = curString.toCharArray();
      for (int j = curChars.length - 1; j >= 0; j--)
      {
        System.out.print(curChars[j]);
      }
      System.out.println();
    }
  }
}