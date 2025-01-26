class Solution {
    public static boolean isPalindrome(int x) {
        // String s = String.valueOf(x);

        // String sx="";

        // for(int i=s.length()-1;i>=0;i--){
        //     sx+=s.charAt(i);    
        // }

        // return (s.equals(sx))?true:false;
        if (x < 0) {
            return false;
        }

        // Convert the integer to a string
        StringBuffer s = new StringBuffer(String.valueOf(x));
        
        // Reverse the string and compare
        return s.toString().equals(s.reverse().toString());
    }
    public static void main(String[]args){
        
        System.out.println(isPalindrome(-121));

    }
}