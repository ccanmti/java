class Student{
    public int num;
}

public class class03{
    public static void main(String[] args){
        Student Tarou = new Student();
        Student Hanako = new Student();
        Tarou.num = 10;
        Hanako.num = 20;

        System.out.println(Tarou.num);
        System.out.println(Hanako.num);
    }
}