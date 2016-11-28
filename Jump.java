import java.util.Scanner;

public class Jump {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int length=cin.nextInt();
            int[] jumps=new int[length];
            for (int i = 0; i < length; i++) {
                jumps[i]=cin.nextInt();
            }
            int count=jump(jumps,0);
            if(count<=0) {
                System.out.println(-1);
            }else {
                System.out.println(count);
            }
        }
    }
    static int jump(int[] jumps,int now){
        if(now>=jumps.length){
            return 0;
        }
        if(jumps[now]==0){
            return Integer.MIN_VALUE;
        }
        int canjump=jumps[now];

        int min=Integer.MAX_VALUE;
        for (int i = 1; i <=canjump ; i++) {
            int temp=jump(jumps,now+i);
            if(temp>=0){
                if(temp<min){
                    min=temp;
                }
            }
        }
        return min+1;
    }
}
