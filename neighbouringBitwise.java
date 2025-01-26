// Input: derived = [1,1,0]
// Output: true
// Explanation: A valid original array that gives derived is [0,1,0].
// derived[0] = original[0] ⊕ original[1] = 0 ⊕ 1 = 1 
// derived[1] = original[1] ⊕ original[2] = 1 ⊕ 0 = 1
// derived[2] = original[2] ⊕ original[0] = 0 ⊕ 0 = 0
public class neighbouringBitwise {
    public boolean doesValidArrayExist(int[] derived){
        int n=derived.length;
        int[] org = new int[n];

        for(int i=1;i<n;i++){
            org[i]=derived[i-1]^org[i-1];
        }

        for(int i=0;i<n;i++){
            int idx=(i+1)%n;
            if(derived[i]!=(org[i]^org[idx])) return false;
        }

        return true;
    }
    public static void main(String[]args){
         int arr[] ={1,1,0};

         System.out.println(new neighbouringBitwise().doesValidArrayExist(arr));
    }
}
