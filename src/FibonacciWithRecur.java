import java.util.Scanner;
public class FibonacciWithRecur {
    static int fiboWithRecur(int x){
        if(x == 1 || x == 2){
            return 1;
        }
        return fiboWithRecur(x - 1) + fiboWithRecur(x - 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı gir:");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(fiboWithRecur(i));
            System.out.print(" ");
        }
    }
}
