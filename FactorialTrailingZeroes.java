public class FactorialTrailingZeroes {
    public static int factorial(int x){
        if(x<=1){
            return 1;
        }

        return x*factorial(x-1);
    }
    public static int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5; // Count the number of factors of 5
            count += n;
        }
        return count;
    }
    public static void main(String[]args){
        int x = factorial(7);
        String numStr = String.valueOf(x);
        int[] result = new int[numStr.length()];
        int t=0;
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = Character.getNumericValue(numStr.charAt(i));
        }

        for(int i=0;i<result.length;i++){
            if(result[i]<=0){
                t++;
            } 
        }

        System.out.println(trailingZeroes(7));
        System.out.println(factorial(7));
    }
}
