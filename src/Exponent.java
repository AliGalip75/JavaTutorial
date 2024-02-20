import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,k,total =1;
        System.out.print("n:");
        n = scan.nextInt();
        System.out.print("k:");
        k = scan.nextInt();
        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Sonuç:" + total);
    }
}
