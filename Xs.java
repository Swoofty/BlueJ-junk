public class Xs
{
 public static void randomX(){
  String numberOfx = "";
  int z = 0;
  int y = 0;
   while (y < 16){
     y = (int) (Math.random() * 19) + 5;
   }
   while(z <= y){
     z++;
     numberOfx += "x";
   }
  System.out.println(numberOfx);
 }

 public static void main(String[] args) { 
  randomX();
 }
}
