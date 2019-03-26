@FunctionalInterface
interface Demo
{
    void Abc();
    default void show()
    {
        System.out.println("in Demo");
    }
}
interface MyDemo
{
    default void show()
    {
        System.out.println("in MyDemo");
    }
}
class Demoimp implements Demo, MyDemo
{
    public void Abc()
    {
        System.out.println("In abc");
    }
    @Override
    public void show()
    {
        MyDemo.super.show();
    }
}
public class MultipleInheritance
{
    public static void main(String []args)
    {
        Demo obj = new Demoimp();
        obj.Abc();
        obj.show();
    }
}