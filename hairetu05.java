public class hairetu05{
    public static void main(String[] args){
        int[] score = {64,76,98};
        keisan(score);
    }
    public static void keisan(int[] x){
        int sum = 0;
        for(int i = 0; i <x.length; i++ ){
            sum += x[i];
        }
        System.out.println("平均点は"+ (sum/x.length));

        
    }
}