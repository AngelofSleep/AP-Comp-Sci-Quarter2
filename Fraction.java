public class Fraction //class for "fraction" objects imitating a mathematical fraction
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
   public Fraction add(Fraction fr) //two fractions added are the one you used to call method and the one taken as parameter
   {
      int nu = (this.getNum() * fr.getDem()) + (fr.getNum() * this.getDem());
      int de = this.getDem() * fr.getDem();
      return new Fraction(nu, de);
   }
   public Fraction subtract(Fraction fr) //two fractions subtracted are the one you used to call method and the one taken as parameter
   {
      int nu = (this.getNum() * fr.getDem()) - (fr.getNum() * this.getDem());
      int de = this.getDem() * fr.getDem();
      return new Fraction(nu, de);
   }
   public Fraction multiply(Fraction fr) //two fractions multiplied are the one you used to call method and the one taken as parameter
   {
      int nu = this.getNum() * fr.getNum();
      int de = this.getDem() * fr.getDem();
      return new Fraction(nu, de);
   }
   public Fraction divide(Fraction fr) //two fractions divided are the one you used to call method and the one taken as parameter
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
