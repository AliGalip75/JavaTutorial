import java.util.Scanner;

public class LoopAssignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Bir sayı gir:");
        num = scan.nextInt();
        for (int i = 1; i <= num; i *= 4) {
            System.out.println(i);
        }
        for (int i = 5; i <= num; i *= 5) {
            System.out.println(i);
        }
    }
}
