class New{
    public int num;
}
public class class02{
    public static void main(String[] args){
        New obj1;
        obj1 = new New();

        New obj2 = obj1;
        obj1.num = 10;
        obj2.num = 20;

        System.out.println(obj1.num);
    }
}