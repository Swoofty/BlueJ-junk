public class NestedLoopsPractice
{
  public static void asterisk(){
    for(int i = 0; i < 4; ++i){
      for (int y = 0; y < 5; ++y){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
  
  public static void asterisk2(){
    for(int i = 0; i < 5; ++i){
      for (int y = 0; y <= i; ++y){
        System.out.print("*");
      }
      System.out.println("");
    }
  }
  
  public static void numberPyramid(){
    for(int i = 1; i <= 7; ++i){
      for (int y = 0; y < i; ++y){
        System.out.print(i);
      }
      System.out.println("");
    }
  }
  
  public static void numberDiagonal(){
    for(int i = 1; i <= 5; ++i){
      for (int y = 0; y < 5 - i; ++y){
        System.out.print(" ");
      }
      System.out.print(i + "\n");
    }
  }
  
  public static void numberPyramid2(){
    for (int i = 1; i <= 5; ++i){
      for (int y = 0; y < 5 - i; ++y){
        System.out.print(" ");
      }
      for (int y = 0; y < i; ++y){
        System.out.print(i);
      }
      System.out.print("\n");
    }
  }
  
  public static void fancyNumbers(){
    for (int i = 0; i <= 40; ++i){
      System.out.print("");
    }
  }
  
  public static void main(String[] args){
    asterisk();
    asterisk2();
    numberPyramid();
    numberDiagonal();
    numberPyramid2();
  }
}
