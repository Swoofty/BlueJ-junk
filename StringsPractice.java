import java.util.Scanner;

public class StringsPractice
{
  public static void compareStrings(String string1, String string2){
    if(string1 == string2){
        System.out.print("They are aliases.");
    }
    else if (string1.equals(string2)){
        System.out.print("They aren't aliases, but they say the same thing.");
    }
    else{
        System.out.print("They are completely different.");
    }
  }
  public static void main(String[] args){
    String test1 = "test";
    String test2 = "test";
    compareStrings(test1, test2);
  }
}
