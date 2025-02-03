import java.util.*;
public class Fibonacci_method {
    public static void Fibo(int a , int b , int sum){
        for(int i = a ; i< b ; i++){
            sum = a + b ;
            a = b ;
            b = sum ;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int b = n ;
        int a = 0  ;
        int sum = 0 ;
        System.out.println("The fibonacci sequence is : ");
        Fibo(a,b,sum);
        sc.close();
    }
}
