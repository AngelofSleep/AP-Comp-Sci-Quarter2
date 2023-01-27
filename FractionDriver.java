public class FractionDriver //exists solely to test Fraction.java, tests all methods
{
   public static void main(String[] args) 
   {
      Fraction t = new Fraction(3, 4);
      Fraction h = new Fraction(1, 2);
      t.getNum();
      h.getDem();
      System.out.println(t);
      System.out.println(h);
      System.out.println(t.add(h));
      System.out.println(t.subtract(h));
      System.out.println(t.multiply(h));
      System.out.println(t.divide(h));
   }
}
