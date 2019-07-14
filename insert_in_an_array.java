import java.util.*;

public class insert_in_an_array{
public static void main(String args[]){
    int n, pos, ele, i;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    n = s.nextInt();
    int a[] = new int[n + 1];
    System.out.println("Enter all the element of array:");
    for(i=0; i<n; i++){
        a[i] = s.nextInt();
    }
    for(i=0; i<n-1; i++){
        System.out.print(a[i] + ", ");
    }
    System.out.println(a[n-1]);
    System.out.println("Enter the position where you want to insert the new element:");
    pos = s.nextInt();
    System.out.println("Enter the value of new element:");
    ele = s.nextInt();
    if(pos>n){
        System.out.println("Invalid input");
    }else{
        for(i=n; i>=pos; i--){
            a[i] = a[i-1];
        }
    }
    a[pos-1] = ele;
    for(i=0; i<n; i++){
        System.out.print(a[i] + ", ");
    }
    System.out.println(a[n]);
}
}