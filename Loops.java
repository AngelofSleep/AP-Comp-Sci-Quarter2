import java.util.*;
public class Loops
{
   public static void main(String[] args)
   {
      Scanner mae = new Scanner(System.in);
      System.out.println("Enter a starting value: ");
      int s = mae.nextInt();
      System.out.println("Enter an ending value: ");
      int e = mae.nextInt();
      squaresAndCubes(s, e);
      starRectangle();
      starTriangle();
      starReverseTriangle();
   }
   public static void squaresAndCubes(int start, int end)
   {
      for(int x = start; Math.pow(x, 3) < end; x++)
      {
         System.out.println(x + " " + Math.pow(x, 2) + " " + Math.pow(x, 3));
      }
   }
   public static void starRectangle()
   {
      for(int x = 1; x <= 5; x++)
      {
         for(int y = 1; y <= 5; y++)
            System.out.print("*");
         System.out.println();
      }
   }
   public static void starTriangle()
   {
      for(int x = 1; x <= 5; x++)
      {
         for(int y = 1; y <= x; y++)
            System.out.print("*");
         System.out.println();
      }
   }
   public static void starReverseTriangle()
   {
      for(int x = 1; x <= 5; x++)
      {
         for(int y = 5; y > x; y--)
            System.out.print(" ");
         for(int z = x; z > 0; z--)
               System.out.print("*");
         System.out.println();
      }
   }
}