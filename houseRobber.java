public class houseRobber {
    public static int rob(int[] nums) {
        if(nums ==null||nums.length==0){
            return 0;
        }

        if(nums.length==1){
            return nums[0];
        }

        int prev1=0,prev2=0;

        for(int num:nums){
            int temp=Math.max(prev1,prev2+num);
            prev2 = prev1;
            prev1=temp;
        }

        return prev1;
    }
    public static void main(String[]args){
        // Input: nums = [1,2,3,1]
        // Output: 4
        // Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
        // Total amount you can rob = 1 + 3 = 4.

        int arr[] ={1,2,3,1};

        System.out.println(rob(arr));
    }
}
