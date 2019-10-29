import java.util.Scanner;

public class ShowTwos
{
 public static void showTwos(int x){
   int y = 0;
   while (x % 2 == 0){
     y++;
     x = x/2;
   }
   while (y > 0){
     System.out.print("2 * ");
     y--;
   }
   System.out.print(x);
 }
 public static void main(String[] args) { 
    Scanner userNumber = new Scanner(System.in);
    System.out.print("Show twos: ");
    int userInput = userNumber.nextInt();
    showTwos(userInput);
  }
}
