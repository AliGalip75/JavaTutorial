import java.util.Scanner;

public class PrimeNumWithRec {
    static boolean isPrime(int n,int bolen){
        if(n <= 1){
            return false;
        }
        if(n == bolen){
            return true;
        }
        if(n%bolen==0){
            return false;
        }
        return isPrime(n,bolen + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Bir sayı gir:");
        num = scan.nextInt();
        if(isPrime(num,2)){
            System.out.println("Sayı asal");
        }else{
            System.out.println("Sayı asal değil");
        }
    }
}
