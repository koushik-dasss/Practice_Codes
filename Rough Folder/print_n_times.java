import java.util.Scanner;
public class print_n_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        printGFG(n);
        sc.close();
    }
    public static void printGFG(int n ){
        if(n==0){
            return;
        }
        System.out.print("GFG"+" ");
        printGFG(n-1);
    }
    
}
