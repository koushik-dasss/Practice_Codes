import java.util.Scanner;
public class First_Repeating_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array : ");
        for(int element : arr){
            System.out.print(element+" ");
        }
        System.out.println();
        int ctr = 0 ;
        for(int i = 0 ; i<n ; i++){
            ctr+=1;
            if(ctr==2){
                System.out.println("The first repeating element is : "+ ctr);
                break;
            }
        }
        sc.close();
    }
}
