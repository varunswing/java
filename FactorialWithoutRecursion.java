class FactorialWithoutRecursion
{
    public static void main(String []args)
    {
        int fact=1, i;
        int n=4;
        for(i=0; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+"is:"+fact);
    }
}