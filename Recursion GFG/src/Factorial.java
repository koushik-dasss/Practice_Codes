import java.util.Scanner;
public class Factorial {
    public static int Fact(int n ){
        if(n<2){
            return 1 ;
        }else{
            return n*Fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The factorial of a number is : "+ Fact(n));
        sc.close();
    }
}
