import java.util.Arrays;

public class areAlmostEqual {
    public static boolean areAlmostEqual(String s1,String s2){
       if(s1.equals(s2)){
        return true;
       }

       int misMatchCount=0,misMatchIndices[]=new int[2];

       for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)!=s2.charAt(i)){
            if(misMatchCount==2){
                return false;
            }

            misMatchIndices[misMatchCount++]=i;    
        }
       }

       int i=misMatchIndices[0],j=misMatchIndices[1];

       return s1.charAt(i) == s2.charAt(j) && s1.charAt(j)==s2.charAt(i);

    }
    public static void main(String[]args){

        String s = "abcd",s2="dcba";

        System.out.println(areAlmostEqual(s, s2));

    }
}
