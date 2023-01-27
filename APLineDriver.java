import java.util.*;
public class APLineDriver
{
   public static void main(String[] args)
   {
      int a, b, c, f, g; 
      int d = 1;
      Scanner mae = new Scanner(System.in);
      System.out.print("Enter a: ");
      a = mae.nextInt();
      System.out.print("Enter b: ");
      b = mae.nextInt();
      System.out.print("Enter c: ");
      c = mae.nextInt();
      APLine e = new APLine(a, b, c);
      System.out.println("Your line is: " + a + "x + " + b + "y + " + c + " = 0");
      while(d == 1)
      {
         System.out.print("Enter a point to test.\nX-value: ");
         f = mae.nextInt();
         System.out.print("Y-value: ");
         g = mae.nextInt();
         if(e.isOnLine(f, g))
            System.out.println("(" + f + ", " + g + ") is on the line.");
         else
            System.out.println("(" + f + ", " + g + ") is not on the line.");
         System.out.println("Enter 1 if you would like to test another point.");
         d = mae.nextInt();
      }
   }
}