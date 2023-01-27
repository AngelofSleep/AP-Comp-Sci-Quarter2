public class Fraction
{
   private int numerator, denominator;
   public Fraction(int n, int d)
   {
      numerator = n;
      denominator = d;
   }
   public int getNum()
   {
      return numerator;
   }
   public int getDem()
   {
      return denominator;
   }
   public Fraction add(Fraction fr)
   {
      int nu = (this.getNum() * fr.getDem()) + (fr.getNum() * this.getDem());
      int de = this.getDem() * fr.getDem();
      return new Fraction(nu, de);
   }
   public Fraction subtract(Fraction fr)
   {
      int nu = (this.getNum() * fr.getDem()) - (fr.getNum() * this.getDem());
      int de = this.getDem() * fr.getDem();
      return new Fraction(nu, de);
   }
   public Fraction multiply(Fraction fr)
   {
      int nu = this.getNum() * fr.getNum();
      int de = this.getDem() * fr.getDem();
      return new Fraction(nu, de);
   }
   public Fraction divide(Fraction fr)
   {
      int nu = this.getNum() * fr.getDem();
      int de = this.getDem() * fr.getNum();
      return new Fraction(nu, de);
   }
   public String toString()
   {
      return numerator + "/" + denominator;
   }
}