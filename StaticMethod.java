@FunctionalInterface
interface Demo
{
    int num = 9;
    void Abc();
    static void show()
    {
        System.out.println("Static Mehtod");
    }
}
class Demoimp implements Demo
{
    public void Abc()
    {
       System.out.println("number = "+ num);
    }
}
public class StaticMethod
{
    public static void main(String []args)
    {
        Demo obj = new Demoimp();
        obj.Abc();
        Demo.show();
    }
}