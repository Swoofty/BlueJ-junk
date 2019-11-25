import java.util.Scanner;

public class ShowThrees
{
 public static void showThrees(int noOfSquares){
    int y = 0;
    for(int x = 1; y < noOfSquares; x += 2){
       System.out.print((y += x) + " ");
    }
 }
 public static void main(String[] args) { 
    Scanner userNumber = new Scanner(System.in);
    System.out.print("Set highest square: ");
    int userInput = userNumber.nextInt();
    showThrees(userInput);
 }
}
