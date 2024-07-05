import java.util.Scanner;
public class BinarySearch {
    public static int RecursiveBinarySearch(int[] arr , int low , int high , int item){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==item){
                return mid;
            }else if(arr[mid]>item){
                return RecursiveBinarySearch(arr,low-1,mid,item);
            }else{
                return RecursiveBinarySearch(arr,mid+1,high,item);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the sorted  array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the sorted array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int low = 0 ;
        int high = n-1;
        System.out.println("Enter the item to be searched : ");
        int item = sc.nextInt();
        if(RecursiveBinarySearch(arr,low,high,item)!=-1){
            System.out.println("The element is found at "+ RecursiveBinarySearch(arr,low,high,item)+ " position");
        }else{
            System.out.println("The element is not present in the array");
        }
        sc.close();
    }
}
