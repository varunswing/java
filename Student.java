import java.util.*;

class Student{

        String name, branch;
        int rollno;

        Student(){          //constructer name is same as class.
        this.name="Varun";
        this.rollno=1;
        this.branch="CSE";

        }

        void display(){
            System.out.println("Name: " + name +"\tRoll Number: " + rollno +"\tBranch: " + branch);
            
        }
    
        public static void main(String[] args){
           /* Scanner s = new Scanner(System.in);

            System.out.println("Enter the name:");
            String name = s.nextLine();

            System.out.println("Enter the roll.no:");
            int rollno = s.nextInt();

            System.out.println("Enter the branch:");
            String branch = s.nextLine();
           */
            Student S1=new Student();
            S1.display();
        }    

    
}