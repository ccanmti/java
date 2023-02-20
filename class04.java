class Student{
    public int num;
}
public class class04{
    public static void main(String[] args){
        Student[] array;
        array = new Student[3];

        array[0] = new Student();
        array[1] = new Student();
        array[2] = new Student();

        array[0].num = 10; 
        array[1].num = 20;
        array[2].num = 30;
        System.out.println(array[0].num);
        System.out.println(array[1].num);
        System.out.println(array[2].num);
    }
}