/*Write a java program to greet someone. Your program stores person name and greeting
message into two variables, and displays their values on the screen.
E.g. Hey Rishi, Good Morning! */
import java.util.Scanner;
public class A1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hey "+ name +", Good Morning! ");
        sc.close();
    }
}
