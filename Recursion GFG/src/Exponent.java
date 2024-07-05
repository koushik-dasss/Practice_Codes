import java.util.Scanner;
public class Exponent {
    public static int Power(int base , int power){
        if(power==0){
            return 1 ;
        }else{
            return base*Power(base,power-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base = sc.nextInt();
        System.out.println("Enter the power : ");
        int power = sc.nextInt();
        System.out.println(base+" to the power "+ power+  " is : "+ Power(base,power));
        sc.close();
    }
}
