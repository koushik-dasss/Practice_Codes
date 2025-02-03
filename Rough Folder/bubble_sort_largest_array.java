import java.util.Scanner;
public class bubble_sort_largest_array {
    public static int[] Bubble_Sort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = 0 ; j< arr.length - i - 1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array elements are:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("The sorted array elements are : " );
        for(int ele : Bubble_Sort(arr)){
            System.out.print(ele +" ");
        }
        System.out.println();
        int max = arr[n-1];
        int min = arr[0];
        System.out.println("The max element is : "+ max);
        System.out.println("The min element is :"+ min);
        int max_index = n -1 ;
        int min_index = 0 ;
        int temp = arr[min_index];
        arr[min_index] = max;
        arr[max_index] = temp;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        sc.close();
    }
}
