class A 
{
    public void show()
    {
        System.out.println("in A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in B");
    }
    public void config()
    {
        System.out.println("config");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("in C");
    }
}
public class DynamicMethodDispatch
{
    public static void main(String[] args){
        A obj1 = new B(); // Reference of Super class(i.e A) and object of sub class(i.e B).
        obj1.show();
        // obj1.config(); // It will give error as the reference class(i.e A) don't have the method show(), but obj1 is refrence of A.

        obj1 = new C();   // It is also reference of Super class(i.e A) and object of sub class(i.e C).
        obj1.show();
    }
}