import java.lang.Math;
import java.util.Random;
class RandomNumbers
{
  public static void main(String[] args)
  {
    Random rand = new Random();
    String[] items = {"Longsword", "Cutlass", "Rapier"};
    String[] itemDesc = {"A plain but deadly longsword", 
                         "A single sided curved blade, famous for it's use in pirate crews.", 
                         "A pointy blade meant for stabbing."};
    
    for (int i = 0; i <= 100; i++)
    {
      int itemId = rand.nextInt(3);
      System.out.println(items[itemId]);
      System.out.println(itemDesc[itemId]);
      
    }
  }
}