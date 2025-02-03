import java.util.Scanner;
public class HA1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(2 + "bc"); // 2bc
        System.out.println(2 + 3 + "bc"); // 5bc
        System.out.println((2+3) + "bc"); // 5bc
        System.out.println("bc" + (2+3)); // bc5
        System.out.println("bc" + 2 + 3); // bc23
        sc.close();
    }
}
