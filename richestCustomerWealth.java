public class richestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        return 0;
    }
    public static void main(String[]args){

        int a[][]={{1,2,3},{1,2,4}};

        int ans = Integer.MIN_VALUE;

        for(int i = 0;i<a.length;i++){
           int sum = 0;
           for(int j=0;j<a[i].length;j++){
            sum+=a[i][j];
            if(ans<sum){
                ans=sum;
            }
           }
           System.out.println(ans);
           
        }

        

    }
}
