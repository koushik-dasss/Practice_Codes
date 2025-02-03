import java.util.Scanner;
public class A1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int c = sc.nextInt(), d = sc.nextInt();
        System.out.println("Before swap c is : "+ c + " and d is : "+ d);
        c = c+d;
        d = c-d;
        c = c-d;
        System.out.println("After swap c is : "+ c + " and d is : "+ d);
        sc.close();
    }
}
