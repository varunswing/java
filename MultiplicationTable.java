import java.util.Scanner;

class MultiplicationTable
{
    public static void main(String []args)
    {
        Scanner a = new Scanner(System.in);

        int x = a.nextInt();
        int i;
        for(i=1; i<=10; i++)
        {
            System.out.println(x+ "*" + i + "=" + (x*i));
        }
    }
}