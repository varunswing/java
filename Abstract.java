abstract class Human
{
    public abstract void walk();
    public void eat()  
    {

    }
}
class Man extends Human
{
    public void walk()
    {
        System.out.println("Walking is a healthy habit.");
    }
}
public class Abstract
{
    public static void main(String[] args)
    {
        Human obj = new Man();
        obj.walk();
    }
}