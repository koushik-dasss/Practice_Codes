/*Write a java program to store your Bank account no, name and balance in three different
variables and display their value on the screen as given:
“My name is Amit Kumar  bearing account number 123456
having balance 7654.98” */
import java.util.Scanner;
public class A1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your account number : ");
        int acc_no = sc.nextInt();
        System.out.println("Enter your balance : ");
        double balance = sc.nextDouble();
        System.out.println("My name is " + name + "  bearing account number " + acc_no + " having balance " + balance);
        sc.close();
    }
}
