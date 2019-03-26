@FunctionalInterface
interface demo
{
    void Abc();
    default void show()
    {
        System.out.println("I am the best.");
    }
}
class demoimp implements demo
{
    public void Abc()
    {
        System.out.println("In abc");
    }
    public void show()
    {
        System.out.println("Method overridden");
    }
}
public class DefaultMethod
{
    public static void main(String []args)
    {
        demo obj = new demoimp();
        obj.Abc();
        obj.show();
    }
}