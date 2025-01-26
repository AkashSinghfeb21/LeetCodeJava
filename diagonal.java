public class diagonal {
    public static void main(String[]args){
        //Output: 25
        int mat[][] = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        
        int sum =0;
        
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if(i!=mat.length-i-1){
                sum+=mat[i][mat.length-i-1];
            }
        }

        System.out.println(sum);
        System.out.println(mat.length);
    }
    
}
