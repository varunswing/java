public class WrapperClass
{
    public static void main(String []args)
    {
        Integer i1=Integer.valueOf("101011",2);
        Double d1=Double.valueOf("3.14");
        int a=Integer.parseInt("13");
        double b=Double.parseDouble("13.45");
        int c=i1.intValue();
        
        System.out.println("C is "+c);
        System.out.println("B is "+b);
        System.out.println("A is "+a);
        System.out.println("D1 is "+d1);
        System.out.println("I1 is "+i1);
    }
}