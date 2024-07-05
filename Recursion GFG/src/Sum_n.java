import java.util.Scanner;

public class Sum_n {
    public static int Sum(int n ){
        if(n==0){
            return 0;
        }else{
            return n+Sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The sum of the series is : "+ Sum(n));
        sc.close();
    }
}
