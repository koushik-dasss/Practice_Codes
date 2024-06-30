import java.util.Scanner;
public class Kth_largest_smallest {
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
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The elements of the sorted  array are : ");
        for(int element : arr){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("Enter the value of K : ");
        int K = sc.nextInt();
        System.out.println("The "+ K+"th largest element is : "+ arr[(n-K)]);
        System.out.println("The "+ K+"th smallest element is : "+ arr[K-1]);

   }
}
