/*
import java.util.Scanner;
public class Union_Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array 1  : ");
        int n1= sc.nextInt();
        System.out.println("Enter the number of elements in the array 2  : ");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements in the array 1 : ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in the array 2 : ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("The elements of the array 1 are : ");
        for (int element : arr1) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("The elements of the array 2 are : ");
        for (int element : arr2) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Enter the number of elements in the intersection array   : ");
        int size = 0 ;
        if(n1>n2){
            size  = n1;
        }else{
            size = n2;
        }
        int [] common = new int[size];
        for(int i = 0 ; i < n1 ; i++){
            for(int j = 0 ; j < n2 ; j++){
                if(arr1[i]==arr2[j]){
                    common+=arr1[i];
                }
            }
        }
    }
}
*/