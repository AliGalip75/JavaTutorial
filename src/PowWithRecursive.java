import java.util.Scanner;

public class PowWithRecursive {
    static int exponent(int a,int b){
        if(b > 0){
            return a*exponent(a,b-1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base,exp;
        System.out.print("Taban:");
        base = scan.nextInt();
        System.out.print("Üs:");
        exp = scan.nextInt();
        System.out.println(exponent(base,exp));
    }
}
