/*Assume a string variable ruler1 contains “1” initially i.e. String ruler1=”1” Write a java
program to print the following output using string concatenation. (You can take extra string
variables)
1
1 2 1
1 2 1 3 1 2 1
1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 */
import java.util.Scanner;
public class A1Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = "1";
        System.out.println(S1);
        S1 = S1 +"2" + S1 ;
        System.out.println(S1);
        S1 = S1 + "3" + S1 ;
        System.out.println(S1);
        S1 = S1 + "4" + S1 ;
        System.out.println(S1);
        sc.close();
    }
}
