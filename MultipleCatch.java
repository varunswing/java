public class MultipleCatch
{
    public static void main(String []args)
    {
        try
        {
            int a[] = null;
            a[4] = 8;
            int i = 7;
            int j = 2;
            int k = i/j;
            System.out.println("Output is " +k);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error ");
        }
        catch(Exception e)
        {
            System.out.println("Something wrong");
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}