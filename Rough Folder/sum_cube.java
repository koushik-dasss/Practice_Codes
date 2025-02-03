import java.util.Scanner;
public class sum_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The sum is : "+ cube(n));
        sc.close();
    }
    public static int cube(int n ){
        if(n==0){
            return 0; 
        }else{
            return (n*n*n)+cube(n-1);
        }
    }
    
}
