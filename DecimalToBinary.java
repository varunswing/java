import java.util.Scanner;

class DecimalToBinary
{
    public static void main(String []args)
    {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter a binary no.");
        int n=s.nextInt();
        int decimal=0,p=0;
        while(n!=0)
        {
            decimal+=((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }
            System.out.println(decimal);
    }
}