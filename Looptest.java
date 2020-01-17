public class Looptest
{
    public static void main(String[] args){
        int[] evenArray = new int[3];
        int[] randomArray = new int[5];
        for(int x = 0; x < randomArray.length; ++x){
            randomArray[x] += x;
        }
        for(int x: randomArray){
            System.out.println(randomArray[x]);
        }
        int evenCount = 0;
        for(int x: randomArray){
            if(randomArray[x] % 2 == 0){
                ++evenCount;
                evenArray[evenCount] += randomArray[x];
            }
        }
        for(int x: evenArray){
            System.out.println(evenArray[x]);
        }
    }
}
