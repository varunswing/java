class Student
{
    private int rollno;
    private String name;

    public int getRollno()
    {
        System.out.println("User is accessing the value.");
        return rollno;
    }
    public void setRollno(int rollno)
    {
        this.rollno = rollno;
        System.out.println("Value of rollno changed.");
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
public class Encapsulation
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setRollno(2);                       // Here it can be s1.rollno = 2, but it is not much secure and voilates the princple of encapsulation. 
        s1.setName("Mayank");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}