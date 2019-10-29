import java.util.Scanner;

public class EfficientUserInput
{
  public static void randomStuff(int nO){
      if (nO > 100){
          System.out.println("The number is bigger than 100");
        }
      else {
          System.out.println("The number you inputted is not bigger than 100");
        }
    }
  public static void main(String[] args) { 
      Scanner userNumber = new Scanner(System.in);
      System.out.print("Enter a number to check if it bigger than 100: ");
      int userInput = userNumber.nextInt();
      EfficientUserInput moreTest = new EfficientUserInput();
      moreTest.randomStuff(userInput);
  }
}
