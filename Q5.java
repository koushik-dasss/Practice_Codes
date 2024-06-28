import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Enter the index at which you want the character from string : ");
        int index = sc.nextInt();
        System.out.println("The character at "+ index +" of the string "+ str + " is : "+ str.charAt(index));
        System.out.println("The unicode of character at "+ index +" of the string "+ str + " is : "+ str.codePointAt(index));
        System.out.println("The unicode before the  character at "+ index +" of the string "+ str + " is : "+ str.codePointBefore(index));
        System.out.println("The unicode count  from range  0 to "+ index +" of the string "+ str + " is : "+ str.codePointCount(0,index));
        System.out.println("Enter another string : ");
        sc.nextLine(); // Buffer
        String str2 = sc.nextLine();
        System.out.println(str.compareTo(str2));
        System.out.println(str.compareToIgnoreCase(str2));
        System.out.println(str.concat(str2));
        System.out.println(str.contains(str2));
        System.out.println(str.contentEquals(str2));
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        System.out.println("Enter an array of characters : ");
        char[] arr = new char[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i]=sc.next().charAt(0);
        }
        System.out.println(String.copyValueOf(arr));
        sc.nextLine();// Buffer
        System.out.println("Enter a suffix : ");
        String  suffix = sc.nextLine();
        System.out.println(str.endsWith(suffix));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));



        sc.close();
    }
}
