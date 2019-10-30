public class Xs
{
 public static void randomX(){
  int z = 0;
  int y = 0;
   while (y < 16){
     y = (int) (Math.random() * 19) + 5;
     String numberOfx = "x";
     System.out.println(numberOfx.repeat(y));
   }
 }

 public static void main(String[] args) { 
    randomX();
  }
}
