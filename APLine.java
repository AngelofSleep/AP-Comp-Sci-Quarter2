public class APLine
{
   private int a, c;
   private double b, slope;
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