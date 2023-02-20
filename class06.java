class New{
    private int num;
    public void setNum(int x){
        num = x;
        System.out.println(num);
    }
}

public class class06{
    public static void main(String[] args){
        New obj = new New();
        obj.setNum(10);
    }
}