import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Enter the character that will be placed : ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the index position where the character is to be replaced : ");
        int index = sc.nextInt();
        String newStr = str.substring(0,index)+ch+str.substring(index+1);
        System.out.println("The string "+ str + " after replacement is : "+ newStr);
        sc.close();
    }
}

