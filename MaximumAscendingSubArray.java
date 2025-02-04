// Example 1:

// Input: nums = [10,20,30,5,10,50]
// Output: 65
// Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
// Example 2:

// Input: nums = [10,20,30,40,50]
// Output: 150
// Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
public class MaximumAscendingSubArray{
    public int MaxAscendingSum(int []nums){
        int curr=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=nums[i]>nums[i-1]?curr+nums[i]:nums[i];
            ans=Math.max(ans, curr);
        }

        return ans;
    }
    public static void main(String[]args){
      int arr[] = {10,20,30,5,10,50};

      System.out.println(new MaximumAscendingSubArray().MaxAscendingSum(arr));
    }
}