import java.util.Scanner;
public class HA1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 3.14159;
        System.out.println(a); // 3.14159
        System.out.println(a+1); // 4.14159
        System.out.println(8/(int) a); // 2
        System.out.println(8/a); // 2.54
        System.out.println((int) (8/a)); // 2
        sc.close();
    }
}
