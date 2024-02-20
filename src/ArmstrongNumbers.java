import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir:");
        int num = scan.nextInt();//num == abcd
        int a,b,c,d;
        a = num/1000;
        b = (num/100)%10;
        c = (num/10)%10;
        d = num%10;
        System.out.println("Sayının rakamları toplamı:" + (a + b + c + d));
    }
}
