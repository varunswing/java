public class ExceptionHandling
{
    public static void main(String []args)
    {
        try
        {
            int i = 7;
            int j = 2;
            int k = i/j;
            System.out.println("Output is " +k);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error ");
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}