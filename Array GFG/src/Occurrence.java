// Occurrence of an element in an array
import java.util.Scanner;
public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are : ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Enter the element : ");
        int ele = sc.nextInt();
        int ctr = 0 ;
        for(int element : arr){
            if(element == ele){
                ctr++;
            }
        }
        System.out.println("The element "+ ele + " occurred "+ ctr + " times.");
    }
}
