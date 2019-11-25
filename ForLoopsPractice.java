import java.util.Scanner;

public class ForLoopsPractice
{
  public static void welToJava(){
    for (int x = 0; x < 10; x++){
      System.out.println("Welcome to Java");      
    }
  }
  
  public static void allHundered(){
    for (int x = 1; x <= 100; x++){
      System.out.println(x);
    }  
  }
  
  public static void allThousand(){
    int y = 0;
    for (int x = 1; x <= 1000; x++){
      y += x;
    }
    System.out.println(y);
  }
  
  public static void isPrime(int x){
    defaultloop:
    for(int i = 2; i < x; i++){
      if(x % i == 0){
        System.out.println("The number is not prime");
        break defaultloop;
      }
      System.out.println("The number is prime");
    }
  }
}
