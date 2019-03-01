class A
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int i)
    {
        System.out.println("in A int");
    }
}
class B extends A
{
    public B()
    {
        super(4); // Parameter calls the parameterized constructor of A when default constructer of B is called.
        System.out.println("in B");
    }
    public B(int i)
    {
        super(3); // Parameter calls the parameterized constructor of A when paramet constructer of B is called.
        System.out.println("in B int");
    }
}
public class Super
{
    public static void main(String[] args)
    {
        B obj1 = new B(); // Parameter calls the parameterized constructor of B and default constructer of A.
    }
}
