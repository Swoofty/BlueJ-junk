import java.util.Scanner;

public class StringLength
{
 public static void printChars(String str){
   for (int i = 0; i < str.length(); i++){
       System.out.println(str.substring(i, (i+1)));
    }   
 }
}
