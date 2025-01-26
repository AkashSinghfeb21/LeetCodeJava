public class isrobotBounded {
    public boolean isRobotBounded(String instructions) {
        int [][] directions={{0,1},{1,0},{0,-1},{-1,0}};

        int x=0,y=0;

        int dir=0;

        for(char i:instructions.toCharArray()){
            if(i=='G'){
                x+=directions[dir][0];
                y+=directions[dir][1];
            }else if(i=='L'){
                dir=(dir+3)%4;
            }else if(i=='R'){
                dir=(dir+1)%4;
            }
        }
        return (x==0 && y==0)||dir!=0;
    }
    public static void main(String[]args){
        System.out.println(new isrobotBounded().isRobotBounded("GGLLGG"));
        System.out.println(new isrobotBounded().isRobotBounded("GG"));
    }
}
