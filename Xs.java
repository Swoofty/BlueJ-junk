import java.util.Scanner;

public class Xs
{
 public static void randomX(){
   int y = 0;
   while (y < 16){
     y = (int) (Math.random() * 19) + 1;
     String numberOfx = "x";
     System.out.println(numberOfx.repeat(y));
   }
 }
 public static void main(String[] args) { 
    randomX();
  }
}
