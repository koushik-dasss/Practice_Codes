// Min and Max element in the array
import java.util.Scanner;
public class Min_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i = 0 ; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are : ");
        for(int element : arr){
            System.out.print(element+" ");
        }
        System.out.println();
        int max = arr[0];
        int min = arr[0];
        for(int i = 0 ; i<n ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The max element in the array is : "+ max);
        System.out.println("The min element in the array is : "+ min);
        sc.close();
    }
}
