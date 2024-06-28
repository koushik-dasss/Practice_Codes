import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        if (str.length() <= 1) {
            System.out.println("The reversed string is : " + str);
        }
        String reversedString = "";
        for(int i = str.length()-1 ; i>=0 ; i--){
            reversedString+=str.charAt(i);
        }
        System.out.println("The reversed string is "+ reversedString);
        sc.close();
    }
}
