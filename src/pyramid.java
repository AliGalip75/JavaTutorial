import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,j,k,n;
        System.out.println("Piramidin uzunluğunu gir:");
        n = scan.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (k = 1;k <= (2*i-1);k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
