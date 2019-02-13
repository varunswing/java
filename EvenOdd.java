import java.util.Scanner;

class EvenOdd
{
    public static void main (String[] args)
    {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        if(x%2==0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }
    }
}