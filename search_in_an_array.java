import java.util.*;

public class search_in_an_array{
public static void main(String args[]){
    int n, ele, i;
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
    System.out.println("Enter the element to be searched:");
    ele = s.nextInt();
    for(i=0; i<n; i++){
        if(a[i] == ele){
            System.out.println("Element found!");
        }
    }
}
}