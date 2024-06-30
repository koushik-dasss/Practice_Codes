import java.util.Scanner;
public class Q2 {
    public static boolean EmailValidChecker(String email){
        if(email==null || email.length()<=1){
            return false;
        }
        int atPosition = email.indexOf('@');
        int lastIndex = email.lastIndexOf('@');
        if(atPosition==-1 || lastIndex!=atPosition){
            return false;
        }
        String localPart = email.substring(0,atPosition);
        String domainPart = email.substring(atPosition+1);
        return !localPart.isEmpty() && !domainPart.isEmpty();
        // not checking more conditions as it will be very long if all conditions are checked
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email = sc.nextLine();
        if(EmailValidChecker(email)){
            System.out.println("The email "+ email + " is in correct format.");
        }else{
            System.out.println("The email "+ email + " is not in correct format.");
        }
        sc.close();
    }
}
