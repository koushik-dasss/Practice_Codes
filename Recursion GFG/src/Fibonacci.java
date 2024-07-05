import java.util.Scanner;
public class Fibonacci {
    public static int Fibo(int n ){
        if(n<2){
            return n ;
        }else{
            return Fibo(n-1)+Fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The fibonacci series until "+ n + " is : "+ Fibo(n));
    }
}
