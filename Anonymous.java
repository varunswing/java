class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
interface Abc
{
    void display();
}
public class Anonymous
{
    public static void main(String []args)
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In A show.");
            }
        };
        obj.show();
        Abc I = new Abc()
        {
            public void display()                // We can create an object of interface using anonymous class.
            {
            System.out.println("Im the best.");
            }
        };
        I.display();
    }
}