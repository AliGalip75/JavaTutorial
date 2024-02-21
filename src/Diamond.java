import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,j,k,n;
        System.out.print("Uzunluğunu gir:");
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
        for (int l = 1; l <= (n-1); l++) {
            for (int m = 1; m <= l; m++) {
                System.out.print(" ");
            }
            for(int p = 1;p <= 2*n-1-2*l;p++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
