import java.util.*;
public class sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The sum of the  "+ n + " numbers is : "+ sum(n));
        sc.close();
    }
    public static int sum(int n ){
        if(n==0){
            return 0 ; 
        }else{
            return n +sum(n-1);
        }
    }
    
}
