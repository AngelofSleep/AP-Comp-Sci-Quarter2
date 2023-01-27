public class APLine //created as a response to a practice AP exam question
                    //makes line ax + by + c = 0, where neither a or b is 0 and a,b,c all integers
{
   private int a, c;
   private double b; //b + e doubles so getSlope may return a double if value of slope isn't an integer
   public APLine(int d, double e, int f)
   {
      a = d;
      b = e;
      c = f;
   }
   public double getSlope()
   {
      return (-1 * a)/b;
   }
   public boolean isOnLine(int g, int h)
   {
      return (a * g) + (b * h) + c == 0;
   }
}
