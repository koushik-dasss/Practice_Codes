import java.util.Scanner;
public class HA1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2147483647 ;
        System.out.println(a); // 2147483647
        System.out.println(a+1); // -2147483648
        System.out.println(2-a); // -2147483645
        System.out.println(-2-a);//  2147483647
        System.out.println(2*a); // -2 ( - of even number)
        System.out.println(4*a); // -4 ( - of even number)
        System.out.println(5*a); // subtract  the odd number

        sc.close();
    }
}
