public class kansuu03{
// 重要！！！！
    public static void main(String[] args){
        int apple =31;
        int result = keisan(apple);
        if(result > 3000){
            System.out.println("予算オーバーです");
        }else{
            System.out.println("予算以内です");
        }
    }
    public static int keisan(int x){
        int goukei = x * 100;
        return goukei;
    }
}