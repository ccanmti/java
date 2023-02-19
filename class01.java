class Student{
    public int num;
    public void show() {
        System.out.println(num);
    }
}

public class class01{
    public static void main(String[] args){
        Student Tarou;  //インスタンスか
        Tarou = new Student(); //newで本体を作る
        Tarou.num = 10; //numに10を格納
        Tarou.show();   //showで表示
    }
}