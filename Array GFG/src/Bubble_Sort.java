// Sort the elements of the array (Bubble Sort)
import java.util.Scanner;
public class Bubble_Sort{
    public static int[] BubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
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
        System.out.println("The sorted array is : ");
        for(int element : BubbleSort(arr)){
            System.out.print(element+" ");
        }
    }
}
