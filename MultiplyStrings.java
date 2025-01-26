public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int n1 = convert(num1)*convert(num2);

        return n1+"";
    }
    public static int convert(String s){
        int num=0;

        for(int i=0;i<s.length();i++){
            num = num*10+((int)s.charAt(i)-48);
        }

        return num;
    }
    public static void main(String[]args){
        String a = "1234",b="9876";

        System.out.println(new MultiplyStrings().multiply(a, b));
    }
    
}
