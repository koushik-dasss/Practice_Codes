import java.util.Scanner;
public class Reverse_String {
    public static String Reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return Reverse(str.substring(1))+ str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("The reverse of the string "+ str + " is : "+  Reverse(str));
        sc.close();
    }
}
