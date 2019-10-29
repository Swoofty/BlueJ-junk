import java.util.Scanner;

public class Raining
{
  public static String randomStuff(int nO){
      if (nO >= 100){
          return "very hot";
        }
      else if(nO >= 85) {
          return "hot";
        }
      else if(nO >= 75) {
          return "warm";
        }
      else if(nO >= 65) {
          return "comfortable";
        }
      else if(nO >= 50) {
          return "cool";
        }
      else if(nO < 50) {
          return "cold";
        }
      else {
          return "unknown";
        }
  }
  public static void main(String[] args) { 
      Scanner userNumber = new Scanner(System.in);
      System.out.print("Enter a number to check the temperature: ");
      int userInput = userNumber.nextInt();
      Raining moreTest = new Raining();
      System.out.print("The weather is currently " + moreTest.randomStuff(userInput));
  }
}
