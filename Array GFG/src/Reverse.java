// Reverse the array
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array are : ");
        for(int i = 0 ; i< n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are : ");
        for(int element : arr){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("The elements of the array reversed are : ");
        for(int i = n - 1 ; i>=0 ; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
