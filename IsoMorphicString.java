import java.util.*;
public class IsoMorphicString {
    public static boolean isIsoMorphicString(String s,String t){
       Map<Character,Integer> map1=new HashMap<>();
       Map<Character,Integer> map2=new HashMap<>();

       for(Integer i=0;i<s.length();i++){
        if(map1.put(s.charAt(i),i)!=map2.put(t.charAt(i), i))
        return false;
       }

       return true;
    }
    public static void main(String[]args){
          String n = "erg";
          String l = "atd";
          
          System.out.println(isIsoMorphicString(n, l));

        //   System.out.println(isIsoMorphicString(n, n));
    }
}
