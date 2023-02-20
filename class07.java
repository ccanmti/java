public class class07{
    public static void main(String[] args){
        int[] sum = new int[20];
        sum[0] = 10;
        int i = 0;
        for(i =0; i < 20; i++){
            sum[i]= i * 5;
        }
        for(i = 0;  i < 20; i++){
            if(i < 10){
            System.out.print(sum[i]);
            if(!(sum[i] % 2 ==0))
                System.out.print(",");
            }else{
                System.out.print(sum[i]);
                if(sum[i] % 2 ==0)
                    System.out.print(",");
                
            }
        }
    }
}