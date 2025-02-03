import java.util.*;
public class basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(n*3);
        sc.close();
        System.out.println("The " + n +  " th " + " fibonacci number is : "+ Fibo(n));
    }
    public static int Fibo(int n ){
        if(n<2){
            return n ;
        }else{
            return Fibo(n-1)+Fibo(n-2);
        }
    }
}