class A 
{
    int i;
    public void show()
    {
        System.out.println("in A = " +i);
    }
}
class B extends A
{
    int i;
    public void show()
    {
        super.i=8;
        super.show();
        i=4;
        System.out.println("in B = "+i);
    }
}
public class Overriding
{
    public static void main(String[] args){
        B obj1 = new B();
        obj1.show();
    }
}