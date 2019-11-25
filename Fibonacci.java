public class Fibonacci
{
 public static void spiral(){
    int y = 1;
    for(int x = 1; y < 144; x += y){
       System.out.print(y + " ");
       System.out.print(x + " ");
       y += x;
    }
 }
}
