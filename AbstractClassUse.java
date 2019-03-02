class Printer
{
    public void show(Integer i) // public void show(Number i)
    {                           // {
        System.out.println(i);  //    System.out.println(i);
    }                           // }
                                // By using abstract class we can be saved from making two methods.
    public void show(Double i)  //It is also known as method overloading
    {
        System.out.println(i);
    }
}
public class AbstractClassUse
{
    public static void main(String[] args)
    {
        Printer obj = new Printer();
        obj.show(5.5);
    }
}