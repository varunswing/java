public class Exception
{
    public static void main(String []args)
    {
        int i,j;
        i=8;
        j=9;

        try
        {
            int k = i/j;
            if(k==0)
                throw new MyException("This is not possible.");
            System.out.println(k);
        }
        catch(MyException e)
        {
            System.err.println("Error " + e.getMessage());
        }
    }
}