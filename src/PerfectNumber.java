import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,total=0;
        System.out.print("Bir sayı gir:");
        num = scan.nextInt();
        for (int i = 1; i <= num/2; i++) {
            if(num%i == 0){
                total += i;
            }
        }
        if(total == num){
            System.out.println("Mükemmel sayıdır");
        }else{
            System.out.println("Mükemmel sayı değildir");
        }
    }
}
