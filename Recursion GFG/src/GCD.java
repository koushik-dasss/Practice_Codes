import java.util.Scanner;
public class GCD {
    public static int HCF(int a , int b){
        if(b==0){
            return a ;
        }else{
            return HCF(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt() , b = sc.nextInt();
        System.out.println("The GCD of "+ a + " and "+ b + " is : "+ HCF(a,b));
    }
}
