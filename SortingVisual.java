public class SortingVisual
{
    public static void selectionSort(int[] nums){
        int min = Integer.MIN_VALUE;
        int minIndex = Integer.MIN_VALUE;
        for(int x = 0; x < nums.length; x++){
            min = nums[x];
            minIndex = x;
            for(int y = x; y < nums.length; y++){
                if(nums[x] < min){
                    min = nums[x];
                    minIndex = x;
                } 
            }
            
        }
    }
}
