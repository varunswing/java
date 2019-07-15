import java.util.Scanner;

public class delete_an_element_in_array {
    public static void main(String args[]) {
        int n, pos, i;
        int arr[] = new int[100];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array: ");
        n = s.nextInt();
        System.out.println("Enter the values of element in array: ");
        for(i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Inputed array is: ");
        for(i=0; i<n; i++){
            System.out.println(arr[i]  + " ");
        } 
        System.out.println("Enter the position of element to be deleted: ");
        pos = s.nextInt();
        for(i=pos-1; i<n-1; i++){
            arr[i] = arr[i+1];
        } 
        System.out.println("Array after deleting is: ");
        for(i=0; i<n-1; i++){
            System.out.println(arr[i] + " ");
        }
    }
    
}