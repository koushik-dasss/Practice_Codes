import java.util.Scanner;
public class MovingLeftToZeroes {
    public static int[] MovingLeftToZeroes_Array(int[] arr){
        int left = 0 , right = arr.length -1 ;
        while(left<=right){
            if(arr[left]<0 && arr[right]<0){
                left ++;
            }else if(arr[left]>0 && arr[right]<0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right --;
            }else if(arr[left]>0 && arr[right]>0){
                right --;
            }else{
                left++;
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are : ");
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        System.out.println("The new array is : ");
        for(int ele : MovingLeftToZeroes_Array(arr)){
            System.out.print(ele +" ");
        }
        System.out.println();
        sc.close();
    }
}
