public class Wrapper
{
    public static void main(String []args)
    {
        Integer i1=Integer.valueof("101011",2);
        Double d1=Double.valueof("3.14");
        int a=Integer.parseInt("13");
        double b=Double.parseDouble("13.45");

        int c=i1.intvalue();
    }
}