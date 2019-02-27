class Calculation
{
int fact(int n)
  {
    int result;

    if(n==1)
      return 1;

    result = fact(n-1) * n;
    return result;
  }
}

public class FactorialWithRecursion
{
  public static void main(String args[])
  {
    Calculation obj_one = new Calculation();

    int a = obj_one.fact(4);
    System.out.println("The factorial of the number is : " + a);
  }
}
        