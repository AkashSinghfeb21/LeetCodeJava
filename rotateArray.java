import java.util.Arrays;

public class rotateArray {
    public void rotate(int[] nums,int k){
     for(int i=0;i<k;i++){
        int last = nums[nums.length-1];
        for(int j=nums.length-1;j>0;j--){
            nums[j]=nums[j-1];
        }
        nums[0]=last;
     }
    }
    public static void main(String[]args){
        
        int arr[] = {1,2,3,4};

        new rotateArray().rotate(arr, 2);

        System.out.println(Arrays.toString(arr));

    }
}
