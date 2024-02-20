import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,r,total1=1,total2=1,total3=1,C;
        System.out.print("C(n/r)\nn:");
        n = scan.nextInt();
        System.out.print("r:");
        r = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            total1 *= i;
        }
        for (int i = 1; i <= r; i++) {
            total2 *= i;
        }
        for (int i = 1; i <= (n-r); i++) {
            total3 *= i;
        }
        C = total1/(total2*total3);
        System.out.println(C);
    }
}
