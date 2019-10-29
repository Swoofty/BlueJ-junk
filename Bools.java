import java.util.Scanner;
public class Bools
{
  public void randomStuff(int nO){
      nO %= 5;
      if (nO == 0){
          System.out.print("The number is divisible by 5");
        }
      else {
          System.out.print("The number is not divisible by 5");
        }
    }
  public static void main(String[] args) { 
   Scanner userNumber = new Scanner(System.in);
   System.out.print("Enter a number to see if it is divisible by 5: ");
   int userInput = userNumber.nextInt();
   Bools bruh = new Bools();
   bruh.randomStuff(userInput);
  }
}
