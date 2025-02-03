import java.util.Scanner;
public class missing_number {
    public static int Missing_Number(int[]arr){
        
        return 1 ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of  elements of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array :");
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of array are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        sc.close();
    }
    
}
