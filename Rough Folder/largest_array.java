import java.util.Scanner;
public class largest_array {
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int index(int[] arr) {
        int index = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
                index = i;     
            }
        }
        return index;
    }

    public static int[] swap(int[] arr, int max, int index) {
        int temp = arr[0];
        arr[0] = max;
        arr[index] = temp;
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

        int max = max(arr);
        int maxIndex = index(arr); 

        System.out.println("The max element of the array is: " + max);
        System.out.println("The swapped array is:");
        for (int ele : swap(arr, max, maxIndex)) { 
            System.out.print(ele + " ");
        }
        sc.close();
    }
}
