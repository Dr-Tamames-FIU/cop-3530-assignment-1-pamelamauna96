/*
 * Student ID: 5973457
 * Assigment  1
 */
public class MethodTester
{
    /* 
     * The main method that test the algorthims on different input arrays
    */
    public static void main(String[] args) 
    {
        int[] nums = {-1, 5, -1, 3, -1, 17};
        int[] nums2 = {-5, -3, -1, 4, 6, 8};
        int[] nums3 = { -1, 12, -3, 14, -4, 3 };
        //int[] nums = { 2, -3, 5, -1, 0, 7};

        int result = algorithm1(nums);
        int result2 = algorithm2(nums2);
        int result3 = algorithm3(nums3);

        System.out.println("Algorthim 1: " + algorithm1(nums));
        System.out.println("Max sum: " + result);

        System.out.println("Algorthim 2: " + algorithm2(nums2));
        System.out.println("Max sum: " + result2);

        System.out.println("Algorthim 3: " + algorithm3(nums3));
        System.out.println("Max sum: " + result3);
    }
/**
 * Algo 1: compute the max sum 
 * @param nums
 * @return the max sum of subarrays with a maximum length of 3
 */
    public static int algorithm1(int[] nums) 
    {
        int maxSum = 0;
        int n = nums.length;
        //TODO

        //loop
        for(int i = 0; i < n; i++)
        {
            //loop
            for(int j = 0; j < n; j++)
            {
                int currentSum = 0;
                //loop          
                for(int k = i; k <= j; k++)
                {
                    currentSum += nums[k];
                }
                maxSum = Math.max(maxSum, currentSum);
            }
        }    

                

        return maxSum;
    }

/**
 * Algo 2: compute the max sum
 * @param nums
 * @return the max sum of subarrays with a maximum length of 3
 */
    public static int algorithm2(int[] nums) 
    {
        int maxSum = 0;
        int n = nums.length;
        //TODO
        
        //loop
        for(int i =0; i < n; i++)
        {
            int currentSum = 0;
            for(int j = i; j < n; j++)
            {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    /*
     * Algo 3: compute the max sum  
     * @param nums
     * @return the maximum sum of subarrays with a maximum length of 3
     */
    // Optional
    public static int algorithm3(int[] nums)
    {
        int maxSum = 0;
        int currentSum = 0;
        //TODO
        for(int i = 0; i < nums.length; i++)
        {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            if(i >= 2)
            {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

}
