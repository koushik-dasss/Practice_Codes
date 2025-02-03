import java.util.Scanner;
public class print_n_current_forward_traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        print(1,n);
        sc.close();
    }
    public static void print(int current , int n){
        if(current>n){
            return;
        }
        System.out.print(current + " ");
        print(current+1, n);
    }
    
}