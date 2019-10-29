import java.util.Scanner;

public class UserInput
{
  public static boolean randomStuff(int nO){
      if (nO % 2 == 0){
          return true;
        }
      else {
          return false;
        }
    }
  public static void main(String[] args) { 
      Scanner userNumber = new Scanner(System.in);
      System.out.print("Enter a number to see if it is divisible by 2: ");
      int userInput = userNumber.nextInt();
      UserInput bruh = new UserInput();
      if (bruh.randomStuff(userInput) ==  true){
         System.out.println("The number you inputted is divisible by 2");
        }
      else if (bruh.randomStuff(userInput) == false){
         System.out.println("The number you inputted is not divisible by 2");
        }
  }
}
