class Student{
    public int num;
}

public class class05{
    public static void main(String[] args){
        Student Taro = new Student();
        Taro.num = 10;
        show(Taro);
    }
    public static void show(Student x){
        System.out.println(x.num);
        
    }
}