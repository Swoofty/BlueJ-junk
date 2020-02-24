public class Practice62
{
    public static int lastIndexOf(int[] testArray, int testValue){
        for(int x = testArray.length - 1; x >= 0; --x){
            if(testArray[x] == testValue) return x;
        }
        return -1;
    }
    public static int range(int[] testArray){
        int biggestValue = testArray[0];
        int smallestValue = testArray[0];
        for(int x = 1; x < testArray.length; ++x){
            if(testArray[x] > biggestValue) biggestValue = testArray[x];
            if(testArray[x] < smallestValue) smallestValue = testArray[x];
        }
        return ((biggestValue - smallestValue) + 1);
    }
    public static int countInRange(int[] testArray, int min, int max){
        int totalElements = 0;
        for(int x = 0; x < testArray.length; ++x){
            if(testArray[x] >= min && testArray[x] <= max) ++totalElements;
        }
        return totalElements;
    }
    public static boolean isSorted(double[] testArray){
        for(int x = 0; x < testArray.length - 1; ++x){
            if(testArray[x] >= testArray[x + 1]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[] arrayTest1 = {4, 4, 8, 12, 3, 4, 8};
        System.out.println(lastIndexOf(arrayTest1, 3));
        System.out.println(range(arrayTest1));
        System.out.println(countInRange(arrayTest1, 4, 12));
        double[] arrayTest2 = {1.2, 2.6, 4.4, 5.3, 9.4, 43.7};
        System.out.println(isSorted(arrayTest2));
    }
}
