import java.util.Scanner;

public class Temp
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
      else{
          return "cold";
        }
  }
  public static void main(String[] args) { 
      Scanner userNumber = new Scanner(System.in);
      System.out.print("Enter a number to check the temperature: ");
      int userInput = userNumber.nextInt();
      Temp moreTest = new Temp();
      System.out.print("The weather is currently " + moreTest.randomStuff(userInput));
  }
}
