import java.util.Scanner;
public class Bools2
{
  public void randomStuff(double nO){
      nO *= -7;
      if (nO > 0){
          System.out.print("I climbed a tree yesterday.");
        }
    }
  public static void main(String[] args) { 
   Scanner userNumber = new Scanner(System.in);
   System.out.print("Enter a number: ");
   double userInput = userNumber.nextDouble();
   Bools2 bruh = new Bools2();
   bruh.randomStuff(userInput);
  }
}
