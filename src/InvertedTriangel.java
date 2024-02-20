import java.util.Scanner;

public class InvertedTriangel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("üçgenin uzunluğunu gir:");
        n = scan.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
