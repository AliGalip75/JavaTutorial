import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1 1 2 3 5 8 13 21 34 55 89 ...
        int a=1,b=1,c,n;
        System.out.print("Serinin uzunluğunu gir:");
        n = scan.nextInt();
        System.out.print(a + " " + b);
        for (int i = 1; i <= n-2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}
