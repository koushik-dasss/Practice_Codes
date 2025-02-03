import java.util.Scanner;

/*Write a java program to exchange the values of two variables of integer type X and Y using
third temporary variable Z */
import java.util.*;
public class A1Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before swap : a is : "+ a + " and b is : "+ b);
        int temp = a ;
        a = b  ;
        b = temp;
        System.out.println("After swap : a is : "+ a + " and b is : "+ b);
    }
}