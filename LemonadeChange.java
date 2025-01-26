public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
       int five =0,ten=0;
       for(int bill:bills){
        switch (bill) {
            case 5:
                five++;
                break;
            case 10:
                if(five>0){
                    five--;
                    ten++;
                }  else{
                    return false;
                }
                break;
            case 20:
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }    
        }
       }
       return true;
    }
    public static void main(String[]args){
        int arr[]={5,5,10,10,20};

        System.out.println(lemonadeChange(arr));

    }
}
