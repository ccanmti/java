public class kansuu02{
    public static void main(String[] args){
        int apple,orange;
        apple = 10;
        orange = 5;

        keisan(apple,orange);
    }

    public static void keisan(int x,int y){
        System.out.println("合計は" + ((100 * x) + (200 * y)));
    }

}