import java.util.Scanner;

class Fibonacci
{
    public static void main(String []args)
    {
        System.out.println("Enter no. of terms");

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a=0, b=0, c=1;

        for(int i=1; i<=n; i++)
        {
            a=b;
            b=c;
            c=a+b;

            System.out.println(a + " ");
        }
    }
}