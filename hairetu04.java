import java.util.Scanner;
public class hairetu04{
    public static void main(String[] args){
        System.out.println("要素数は幾つですか？");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int[] array = new int[num];
        System.out.println("数値を入力してください");
        for (int i = 0; i < num; i++){
            array[i] = obj.nextInt();
        }

        for (int i = 0; i < num; i++){
            System.out.println( i + "回目" + array[i]);
        }
        
    }
}