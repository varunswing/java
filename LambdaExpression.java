interface Abc
{
    void show();
}
public class LambdaExpression
{
    public static void main(String []args)
    {
        Abc obj = ()-> System.out.println("I am the best"); //Functional Interface
        obj.show();
    }
}