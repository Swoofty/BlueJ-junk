import java.util.Scanner;

public class MoreUserInput
{
  public static boolean randomStuff(int nO){
      if (nO > 100){
          return true;
        }
      else {
          return false;
        }
    }
  public static void printStatement(boolean test){
      if (test == true){
          System.out.println("The number is bigger than 100");
        }
      else if (test == false){
          System.out.println("The number you inputted is not bigger than 100");
        }
    }
  public static void main(String[] args) { 
      Scanner userNumber = new Scanner(System.in);
      System.out.print("Enter a number to check if it bigger than 100: ");
      int userInput = userNumber.nextInt();
      MoreUserInput moreTest = new MoreUserInput();
      printStatement(moreTest.randomStuff(userInput));
  }
}
