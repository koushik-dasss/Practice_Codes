import java.util.Scanner;
public class PrimeNumber {
    public static void Prime(int a , int b ){
        for(int i = a ; i<= b ; i++){
            boolean flag = true;
            int j =  2 ;
            int sqrt = (int)(Math.sqrt(i));
            while(j<=sqrt){
                if(i%j==0){
                    flag = false;
                    break;
                }
                j++;
            }
            if(flag && i>1){
                System.out.print(i+" ");
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first limit : ");
        int a = sc.nextInt();
        System.out.println("Enter the second limit: ");
        int b = sc.nextInt();
        System.out.println("The prime numbers between "+ a + " and "+ b + " are : ");
        Prime(a,b);
        sc.close();
    }
}
