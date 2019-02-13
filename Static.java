class Example
{
    int x;
    static int y;

    public void fun1(){}
    public static void fun2(){}

    static class Test
    {
        public static String country="INDIA";
    }
}

public class Static
{
    public static void main(String []args)
    {
        Example ex1=new Example();
        Example ex2=new Example();

        Example.fun2();
        System.out.println(Example.Test.country);
    }
}