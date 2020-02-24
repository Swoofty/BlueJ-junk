import java.util.ArrayList;
import java.util.*;

public class Arraylistpractice
{
   public static void swapPairs(ArrayList<String> inputArray){
       String tempVar = "";
       int elementsInList = inputArray.size();
       if(elementsInList % 2 != 0) --elementsInList;
       for(int x = 0; x < elementsInList; x += 2){
           tempVar = inputArray.set(x, inputArray.get(x + 1));
           inputArray.set(x + 1, tempVar);
       }
   }
   public static void removeEvenLength(ArrayList<String> inputArray){
       for(int x = 0; x < inputArray.size(); x += 2){
           inputArray.remove(x);
       }
   }
   public static void doubleList(ArrayList<String> inputArray){
       for(int x = 0; x < inputArray.size(); x += 2) inputArray.add(x + 1, inputArray.get(x));
   }
   public static void minToFront(ArrayList<Integer> inputArray){
       int minVal = Integer.MAX_VALUE;
       int minValLocation = 0;
       for(int x = 0; x < inputArray.size(); ++x){
           if (inputArray.get(x) < minVal) minVal = inputArray.get(x); minValLocation = x;
       }
       int replaceInFront = inputArray.remove(minValLocation);
       inputArray.add(0, replaceInFront);
   }
   public static void removeDuplicates(ArrayList<String> inputArray){
       for(int x = 0; x < inputArray.size() - 1; ++x){
           if (inputArray.get(x) == inputArray.get(x + 1)) inputArray.remove(x + 1);
       }
   }
   public static void main(String[] args){
       ArrayList<Integer> temps = new ArrayList<Integer>();
       temps.add(432); temps.add(423); temps.add(1256); temps.add(437821678); temps.add(64); temps.add(7);
       System.out.println(temps);
       minToFront(temps);
       System.out.println(temps);
   }
}
