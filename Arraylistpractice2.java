import java.util.ArrayList;
import java.util.*;

public class Arraylistpractice2
{
   public static ArrayList<String> swapPairs(ArrayList<String> testArray){
       ArrayList<String> returnArray = new ArrayList<String>();
       for(int x = 0; x < testArray.size() - 1; x += 2){
           String temp = "";
           temp = testArray.set(x, testArray.get(x+1));
           testArray.set(x+1, temp);
       }
       return returnArray;
   }
   public static 
    
   public static void main(String[] args){
       
   }
}
