public class Spinner //object that imitates a board game type spinner
{
   private String color;
   private int sections;
   public Spinner()
   {
      color = "red";
      sections = 4;
   }
   public Spinner(String c, int s)
   {
      color = c;
      sections = s;
   }
   public String getColor()
   {
      return color;
   }
   public int getNum()
   {
      return sections;
   }
   public void setColor(String s)
   {
      color = s;
   }
   public void setNum(int n)
   {
      sections = n;
   }
   public int spin() //simulates spinning a spinner
   {
      return (int)(sections*Math.random()) + 1;
   }
}
