import java.util.*;
class SpinnerGame //requires Spinner.java to run properly
{
  public static void main(String[] args) 
  {
    Scanner mae = new Scanner(System.in);

    int board, posBlue = 0, posPink = 0, posGreen = 0;
    
    Spinner blue = new Spinner("blue",5); //each "player" has their own spinner
    Spinner pink = new Spinner("pink", 3);
    Spinner green = new Spinner("green", 4);

    System.out.println("How many spaces is the board?");
    board = mae.nextInt();
    while(posBlue < board && posPink< board && posGreen < board)
    {
      posBlue += blue.spin();
      posPink += pink.spin();
      posGreen += green.spin();

      System.out.println("Blue is currently at " + posBlue);
      System.out.println("Pink is currently at " + posPink);
      System.out.println("Green is currently at " + posGreen);

      if(posBlue >= board)
        System.out.println("Blue is the winner!");
      else if(posPink >= board)
        System.out.println("Pink is the winner!");
      else if(posGreen >= board)
         System.out.println("Green is the winner!");

    }
  }
}
